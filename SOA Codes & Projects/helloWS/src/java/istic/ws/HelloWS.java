/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istic.ws;

/**
 *
 * @author akaro
 */

import javax.jws.WebService ;
import javax.jws.WebResult ;
import javax.jws.WebParam ;
import javax.jws.WebMethod ;


        
        
@WebService(name="greetingPortType",
            portName="greetingPort",
            serviceName="greetingService",
             targetNamespace="http://greeting.tn")
public class HelloWS {
    @WebMethod(operationName="greetingOperation")
    @WebResult(name="greeting")
    public String SayHello()
            
    {
        return("Hello From JAX-WS") ; }
    
    @WebMethod(operationName="greetingToOperation")
    @WebResult(name="greetingTo")
    public String sayHelloTo(@WebParam(name="FirstName")String FirstName,@WebParam(name="LastName") String LastName)
    {
        return("Hello "+FirstName+" "+LastName) ;
        
        
    }
            
    
}
