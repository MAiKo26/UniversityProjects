/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxapp2;

import xmlBinding.CatalogData;
import java.io.File ;
import java.util.ArrayList;
import java.util.List;
import xmlBinding.Bookdata;

/**
 *
 * @author akaro
 */
public class JAXApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Bookdata> c = new ArrayList<Bookdata>() ;
       
        Bookdata b1 = new Bookdata() ;
        Bookdata b2 = new Bookdata() ;
        
        b1.setAuthor("Moliére");
        b1.setTitle("Remerciment au Roi");
        b1.setGenre("Roman") ;
        b1.setPrice((float) 0.0);
        
        b2.setAuthor("Victor Hugo");
        b2.setTitle("Les Mésirables");
        b2.setGenre("Roman") ;
        b2.setPrice((float) 0.0);        
        
        
        c.add(b1);
        c.add(b2);
        
        CatalogData x = new CatalogData() ;
        
        x.setBooks(c) ;
        
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(x.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(x, System.out);
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
    }
    
}
