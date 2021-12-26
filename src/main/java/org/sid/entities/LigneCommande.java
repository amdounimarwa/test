package org.sid.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommande implements Serializable {
	@Id @GeneratedValue
	private Long qte;
	private BigDecimal prixUnitaire;
	private BigDecimal prixTotal;
	private Long etat;
	@ManyToOne
	@JoinColumn(name="CODE_PROD")
	private Produit produit;
	@ManyToOne
	@JoinColumn(name="CODE_COM")
	private Commande commande;
	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LigneCommande(BigDecimal prixUnitaire, BigDecimal prixTotal, Long etat, Produit produit, Commande commande) {
		super();
		this.prixUnitaire = prixUnitaire;
		this.prixTotal = prixTotal;
		this.etat = etat;
		this.produit = produit;
		this.commande = commande;
	}
	public Long getQte() {
		return qte;
	}
	public void setQte(Long qte) {
		this.qte = qte;
	}
	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public BigDecimal getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(BigDecimal prixTotal) {
		this.prixTotal = prixTotal;
	}
	public Long getEtat() {
		return etat;
	}
	public void setEtat(Long etat) {
		this.etat = etat;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	

}
