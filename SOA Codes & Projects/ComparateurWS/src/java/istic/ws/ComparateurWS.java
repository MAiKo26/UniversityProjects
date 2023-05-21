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


@WebService
public class ComparateurWS {
    
    public int max(int x , int y)
    {
        if (x > y)
        { return x ;}
        else
        { return y ; }
    }
}
