/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.istic;



import generated.Train ;
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
@Path("/Station")
public class TrainRessource {
    
    static List<Train> Station ;
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public String AddTrain(Train T){
    if (Station==null)
    {   Station = new ArrayList<Train>() ; }
        Station.add(T) ;
        return("Le Train a été ajouté a la place"+Station.size());
    }
    
    @Path(value="/GetListTrain")
    @GET
    @Produces("application/xml")
    public List<Train> GetListTrain(){
        return Station ;}
    
    @Path(value="/RechercherTrain/{A}/{B}/{C}/{D}")
    @GET
    @Produces("application/xml")
    public List<Train> RechercherTrain(@PathParam(value="A")String A , @PathParam(value="B")String B , @PathParam(value="C")int C , @PathParam(value="D")int D){
           List<Train> RechResult = new ArrayList<Train>() ;
           
           for (int i=0;i<Station.size();i++){
               if ((Station.get(i).getVilleDepart() == A) && (Station.get(i).getVilleArrive() == B ) && (Station.get(i).getHeureDepart() >= C )&& (Station.get(i).getHeureDepart() <= D ))
               {
               RechResult.add(Station.get(i)) ;
               }
           }
           return RechResult ;
    }
    

     @Path(value="/ReserverTrain/{ID}")
    @GET
    @Produces("application/xml")
    public String ReserverTrain(@PathParam(value="ID")String ID){
        
        Train A = new Train() ;
        
        for (int i=0;i<Station.size();i++){
            if (Station.get(i).getId()==ID)
            { if (Station.get(i).getNbPlaces() > Station.get(i).getNbReservations())
                {Station.get(i).setNbReservations(Station.get(i).getNbReservations()+1) ;
                 A = Station.get(i) ; 
                }
            }
           
        }
        
        if (A.getId() == ID) 
        {return ("Reserveation fait avec succés") ;}
        else
        {return ("Reserveation a été échoué") ;}
                
                
                
        }
    
    
    
    @Path(value="/GetEnsembleReservation")
    @GET
    @Produces("application/xml")
    public List<Train> GetEnsembleReservation(){
      List<Train> RechResult = new ArrayList<Train>() ;
            
      for (int i=0;i<Station.size();i++){
            if (Station.get(i).getNbReservations()>0)
                    {
                        RechResult.add(Station.get(i)) ;
                    }}
               
    
    return RechResult ;
    }
    
    
    
    @Path(value="/SupprimerReservTrain/{ID}")
    @GET
    @Produces("application/xml")
    public String SupprimerReservTrain(@PathParam(value="ID")String ID){
        
        for (int i=0;i<Station.size();i++){
            if (Station.get(i).getId()== ID)
                    {
                       Station.get(i).setNbReservations(Station.get(i).getNbReservations()-1); ;
                    }}
        
        return ("Train supprimé avec succés") ;
    }
     
}
