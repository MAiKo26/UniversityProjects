/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.MySessionRemote;
import javax.ejb.EJB;

/**
 *
 * @author akaro
 */
public class Main {

    @EJB
    private static MySessionRemote mySession;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("result = "+ mySession.getResult());
        
        
        System.out.println("result de 5 + 6 = "+ mySession.doAdd(5,6));

    }
    
}
