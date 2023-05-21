/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparateurwsclient;

/**
 *
 * @author akaro
 */

import istic.ws.ComparateurWS ;
import istic.ws.ComparateurWSService ;

public class Client {
    
    public static void main(String []args){
  //  ComparateurWSService proxy = new ComparateurWSService() ;
    //ComparateurWS service = proxy.getComparateurWSPort() ;
    //System.out.println("Le numero le plus grand est "+service.max(1, 5));
        
        System.out.println(max(1,2)) ;
    
    }

    private static int max(int arg0, int arg1) {
        istic.ws.ComparateurWSService service = new istic.ws.ComparateurWSService();
        istic.ws.ComparateurWS port = service.getComparateurWSPort();
        return port.max(arg0, arg1);
    }
    
    
    
}
