/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowsclient;

/**
 *
 * @author akaro
 */

import tn.greeting.GreetingPortType ;
import tn.greeting.GreetingService ;
import tn.greeting.GreetingOperation ;
import tn.greeting.GreetingToOperation ;

public class MyClient {
    
    public static void main(String []args) {
    GreetingService proxy= new GreetingService() ;
    GreetingPortType service= proxy.getGreetingPort();
    System.out.println(service.greetingOperation());
    System.out.println(service.greetingToOperation("Asma","Ben Mahmoud"));
    
    }
    
}
