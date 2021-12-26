package org.sid.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Produit implements Serializable {
	@Id
	private String code;
	private String marque;
	private String modele;
	private String caracteristiques;
	private BigDecimal prixUnitaire;
	private Long quantite;
	@ManyToOne
	@JoinColumn(name="CODE_CAT")
	private Categorie categorie;
	@OneToMany(mappedBy="produit")
	private List<LigneCommande>ligneCommandes;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String code, String marque, String modele, String caracteristiques, BigDecimal prixUnitaire,
			Long quantite, Categorie categorie) {
		super();
		this.code = code;
		this.marque = marque;
		this.modele = modele;
		this.caracteristiques = caracteristiques;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
		this.categorie = categorie;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Long getQuantite() {
		return quantite;
	}
	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	

}
