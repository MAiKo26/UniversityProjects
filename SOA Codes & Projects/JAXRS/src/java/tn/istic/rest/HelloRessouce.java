/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.istic.rest;

import javax.ws.rs.GET ;
import javax.ws.rs.Path ;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces ;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author akaro
 */
@Path("/hello")
public class HelloRessouce {
@GET
@Produces("text/plain")
public String sayHello(){

    return("Hello from JAX-RS") ;
    
}

        @GET
        @Path(value="sayHelloTo1/{fname}/{lname}")
        @Produces(MediaType.TEXT_PLAIN)
    public String SayHelloTo1(@PathParam(value="fname")String firstName, @PathParam(value="lname")String lastName){
        
     return ("Hello from JAX-RS to "+firstName+" "+lastName )   ;
    }
    
    
      @GET
        @Path(value="sayHelloTo2")
    public String SayHelloTo2(@QueryParam(value="fname")String firstName, @QueryParam(value="lname")String lastName){
        
     return ("Hello 2 from JAX-RS to "+firstName+" "+lastName )   ;
    }
    
    
}
