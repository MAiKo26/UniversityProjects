
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akaro
 */
public class HelloRessourceClient {
    public static void main(String []args){
        
        Client client = ClientBuilder.newClient() ;
        
        WebTarget target = client.target("http://localhost:32533/JAXRS/rest/") ;
        
        WebTarget hello = target.path("hello") ;
        
        Response response = hello.request().get();
        
        String result = response.readEntity(String.class) ;
        
        System.out.println(result);
        
        response.close();
        
        
        WebTarget HelloTo1 = target.path("hello").path("sayHelloTo1").path("ali").path("Ben Slimen") ;
        Response response1 = HelloTo1.request().get() ;
        
        String result1 = response1.readEntity(String.class) ;
        
        System.out.println(result1) ;
        
        response1.close();
        
        
        WebTarget HelloTo2 = target.path("hello").path("sayHelloTo2").queryParam("fname","ali").queryParam("lname","Ben Slimen") ;
        Response response2 = HelloTo2.request().get() ;
        
        String result2 = response2.readEntity(String.class) ;
        
        System.out.println(result2) ;
        
        response2.close();
        
        
        
    }
}
