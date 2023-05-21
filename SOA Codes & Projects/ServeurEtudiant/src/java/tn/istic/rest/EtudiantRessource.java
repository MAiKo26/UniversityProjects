/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.istic.rest;

import generated.Etudiant ;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author akaro
 */
@Path("/classE")
public class EtudiantRessource {
    
    static List<Etudiant> classe ;
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public String PostEtudiant (Etudiant e)
    {
        if (classe==null)
        {
            classe =new ArrayList<Etudiant>() ;
        }
            classe.add(e) ;
            return("created"+classe.size());}
    
    @Path(value="/method1E/{id}")
    @GET
    @Produces("application/xml")
    public Etudiant GetEtudiant (@PathParam(value="id")String id)
    {
        for (int i=0;i<classe.size();i++)
            if (classe.get(i).getId().equals(id))
                return classe.get(i) ;
        return null ;} }
    
 
