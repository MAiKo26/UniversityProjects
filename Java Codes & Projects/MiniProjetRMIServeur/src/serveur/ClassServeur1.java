package serveur;

import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import interfaceP.ProduitInterface;
import produit.Produit;



public class ClassServeur1 extends UnicastRemoteObject implements ProduitInterface {

	static List<Produit> Pr ;
	
	protected ClassServeur1() throws RemoteException{super();}
	
	
	public String AjouterProduit(Produit P) throws RemoteException {
		if (Pr==null)
			Pr=new ArrayList<Produit>();
		Pr.add(P);
		return("Vous avez ajouté "+ Pr.size()+" Produits" );

	}
	
	
	public Produit ConsulterProduit(String ID) throws RemoteException {
		
		Produit e=new Produit();
		
		for (int i=0; i<Pr.size(); i++)
	    {
	    if(Pr.get(i).getId()==ID)
	    {
	        return Pr.get(i); 
	    }
	    } 
		
		return e ;

	
	}
	
	
}
