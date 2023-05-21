package produit;

import java.io.Serializable;

public class Produit implements Serializable {

	private String id ;
	private String libell� ;
	private float prix ;
	private int quantit�Stock ;
	
	public Produit() {}
	
	
	public Produit(String id, String libell�, float prix, int quantit�Stock) {
		super();
		this.id = id;
		this.libell� = libell�;
		this.prix = prix;
		this.quantit�Stock = quantit�Stock;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLibell�() {
		return libell�;
	}
	public void setLibell�(String libell�) {
		this.libell� = libell�;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantit�Stock() {
		return quantit�Stock;
	}
	public void setQuantit�Stock(int quantit�Stock) {
		this.quantit�Stock = quantit�Stock;
	}
	
	
}
