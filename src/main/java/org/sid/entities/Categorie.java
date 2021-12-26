package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie implements Serializable {
	@Id
	private String code;
	private String libelle;
	@OneToMany(mappedBy="categorie")
	private List<Produit>produits;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	

}
