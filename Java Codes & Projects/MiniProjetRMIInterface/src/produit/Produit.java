package produit;

import java.io.Serializable;

public class Produit implements Serializable {

	private String id ;
	private String libellé ;
	private float prix ;
	private int quantitéStock ;
	
	public Produit() {}
	
	
	public Produit(String id, String libellé, float prix, int quantitéStock) {
		super();
		this.id = id;
		this.libellé = libellé;
		this.prix = prix;
		this.quantitéStock = quantitéStock;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLibellé() {
		return libellé;
	}
	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantitéStock() {
		return quantitéStock;
	}
	public void setQuantitéStock(int quantitéStock) {
		this.quantitéStock = quantitéStock;
	}
	
	
}
