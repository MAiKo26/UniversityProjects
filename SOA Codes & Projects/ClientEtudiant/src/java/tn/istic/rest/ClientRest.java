/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.istic.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author akaro
 */
public class ClientRest {
    
    public static void main(String args[]){
        
Client client = ClientBuilder.newClient() ;
WebTarget target = client.target("http://localhost:32533/ServeurEtudiant/rest") ;
WebTarget helloEtj = target.path("classE") ;

Etudiant e = new Etudiant() ;
e.setId("2");
e.setNom("Ben Salah") ;
e.setPrenom("Mohamed") ;

Response responseEtj = helloEtj.request(MediaType.APPLICATION_XML).post(Entity.xml(e)) ;
        
        
String result = responseEtj.readEntity(String.class) ;
System.out.println(result) ;


Etudiant e1 = new Etudiant() ;
e1.setId("3");
e1.setNom(" Salah") ;
e1.setPrenom("Azuiz") ;

Response responseEtj1 = helloEtj.request(MediaType.APPLICATION_XML).post(Entity.xml(e1)) ;

String result1 = responseEtj1.readEntity(String.class) ;
System.out.println(result1) ; 


WebTarget helloE = target.path("classE").path("method1E").path("3") ;
Response responseE = helloE.request().get() ;

Etudiant resultE = responseE.readEntity(Etudiant.class) ;
System.out.println(resultE.getId()+" "+resultE.getNom()+" "+resultE.getPrenom()) ;

       
}
    
}
