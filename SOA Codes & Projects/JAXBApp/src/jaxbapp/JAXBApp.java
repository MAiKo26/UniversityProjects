/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbapp;

import xmlBinding.Company;
import java.io.File ;

/**
 *
 * @author akaro
 */
public class JAXBApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Company c = new Company() ;
       c.setName("Microsoft") ;
       c.setWebsite("https://www.microsoft.com") ;
       
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(c.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(c, System.out);
            marshaller.marshal(c,new File("xmlf/CompanyDocument.xml")) ;
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
       
        Company x = new Company() ;
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(x.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            x = (Company) unmarshaller.unmarshal(new java.io.File("xmlf/HPDocument.xml")); //NOI18N
            System.out.println("L'instance est : "+x.getName()+" "+x.getWebsite());
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        
        
    }
    
}
