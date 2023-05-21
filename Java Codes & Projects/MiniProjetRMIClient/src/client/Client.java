package client;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import interfaceP.ProduitInterface;
import produit.Produit;

public class Client {

	public static void main(String[] args)
	{
	ProduitInterface ic;
	try {
		
		while(true) {
		
	ic = ( ProduitInterface) Naming.lookup ("rmi://localhost:1099/MyObject");
	
	
	System.out.println("Tapez 1 pour Ajouter un Produit , Tapez 2 pour Consulter un Produit ou Tapez 0 pour Terminer") ;
	Scanner sc= new Scanner(System.in);
	Scanner sc1= new Scanner(System.in);

	int i= sc.nextInt();
	
	
	
	if (i==1) {
		
		
		System.out.println("Donner l'ID");
		String a = sc1.nextLine();
		System.out.println("Donner le Libéllé");
		String b = sc1.nextLine();
		System.out.println("Donner le prix");
		float c = sc.nextFloat();
		System.out.println("Donner le quantité stock");
		int d = sc.nextInt();
		
		Produit P = new Produit(a,b,c,d) ;
		String X = ic.AjouterProduit(P);
		System.out.println(X);
	}
	
	if (i==2) {
		
		System.out.println("Donner l'ID");
		String x = sc1.nextLine();


		Produit P = new Produit();
		P = ic.ConsulterProduit(x) ;
		
		System.out.println("Son Libéllé est : "+P.getLibellé());
		System.out.println("Son Prix est : "+P.getPrix());
		System.out.println("Son Quantité est : "+P.getQuantitéStock());

		
	}
	
	if (i==0) {
		System.out.println("Ended") ;
		break;}}
	

	} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (RemoteException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (NotBoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}}


