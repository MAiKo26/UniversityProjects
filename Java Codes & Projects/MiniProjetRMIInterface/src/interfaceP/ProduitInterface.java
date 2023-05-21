package interfaceP;


import java.rmi.Remote;
import java.rmi.RemoteException;
import produit.Produit;


public interface ProduitInterface extends Remote {
public String AjouterProduit(Produit P) throws RemoteException;
public Produit ConsulterProduit(String ID) throws RemoteException;
}