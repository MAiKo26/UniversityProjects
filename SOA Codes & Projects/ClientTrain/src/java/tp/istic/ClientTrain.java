/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.istic;


import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author akaro
 */
public class ClientTrain {
            public static void main(String args[]){
                
                Client client = ClientBuilder.newClient() ;
                WebTarget target = client.target("http://localhost:32533/ServeurEtudiant/rest") ;
                
                               
           Response response1 = target.path("Station").path("GetListTrain").request().get() ;
           List<Train> ResultList = new ArrayList<Train>() ;
           ResultList = response1.readEntity(new GenericType<List<Train>>(){}) ;
           
           for (int i=0;i<ResultList.size();i++){
               System.out.println("Voila le train numéro "+ResultList.get(i).getId()+ " qui départ de la ville "+ResultList.get(i).getVilleDepart()+ "vers la ville "+ResultList.get(i).getVilleArrive()+" de l'heure "+ResultList.get(i).getHeureDepart()+" avec nombre de place et réservation respectivement  "+ResultList.get(i).getNbPlaces()+" "+ResultList.get(i).getNbReservations());
            }
           
           
           Response response2 = target.path("Station").path("RechercherTrain").path("Tunis").path("Jerba").path("1200").path("1400").request().get() ;
           List<Train> ResultList2 = new ArrayList<Train>();
           ResultList2 = response2.readEntity(new GenericType<List<Train>>(){}) ;
           
           Response response3 = target.path("Station").path("ReserverTrain").path(ResultList2.get(1).getId()).request().get() ;
           String result1 = response3.readEntity(String.class);
           System.out.println(result1) ;
           
             Response response4 = target.path("Station").path("SupprimerReservTrain").path(ResultList2.get(1).getId()).request().get() ;
           String result2 = response4.readEntity(String.class);
           System.out.println(result2) ;
                
            }
}
