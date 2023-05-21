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
public class Administrateur {
    
        public static void main(String args[]){
        
        Client client = ClientBuilder.newClient() ;
        WebTarget target = client.target("http://localhost:32533/ServeurEtudiant/rest") ;
        WebTarget Station = target.path("Station") ;
        
        Train T = new Train() ;
        T.setId("1") ;
        T.setHeureDepart(1235);
        T.setVilleDepart("Tunis");
        T.setVilleArrive("Beja");
        T.setNbPlaces(30);
        T.setNbReservations(0);
        
        Response response = Station.request(MediaType.APPLICATION_XML).post(Entity.xml(T)) ;
        String result = response.readEntity(String.class);
        System.out.println(result) ;

        Train T2 = new Train() ;
        T2.setId("2") ;
        T2.setVilleDepart("Tunis");
        T2.setVilleArrive("Jerba");
        T2.setNbPlaces(30);
        T2.setHeureDepart(1300);
        T2.setNbReservations(15);
        
        Response response2 = Station.request(MediaType.APPLICATION_XML).post(Entity.xml(T2)) ;
        String result2 = response2.readEntity(String.class);
        System.out.println(result2) ;
        
        
        
        Response response3 = target.path("Station").path("GetListTrain").request().get() ;
           List<Train> ResultList = new ArrayList<Train>() ;
           ResultList = response3.readEntity(new GenericType<List<Train>>(){}) ;
           
           for (int i=0;i<ResultList.size();i++){
               System.out.println("Voila le train numéro "+ResultList.get(i).getId()+ " qui départ de la ville "+ResultList.get(i).getVilleDepart()+ "vers la ville "+ResultList.get(i).getVilleArrive()+" de l'heure "+ResultList.get(i).getHeureDepart()+" avec nombre de place et réservation respectivement  "+ResultList.get(i).getNbPlaces()+" "+ResultList.get(i).getNbReservations());
            }
           
           
        Response response4 = target.path("Station").path("GetEnsembleReservation").request().get() ;
        List<Train> ResultList2 = new ArrayList<Train>() ;
        ResultList2 = response4.readEntity(new GenericType<List<Train>>(){}) ;
        
        if( ResultList2.size()>0 ){
        for (int i=0;i<ResultList2.size();i++){
            System.out.println(ResultList.get(i).getId());}}
        
        
           
           
}
    
}
