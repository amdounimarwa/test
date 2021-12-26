package org.sid.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Commande implements Serializable {
	@Id
	private String numero;
	private LocalDate date;
	private BigDecimal prixTotal;
	private Long etat;
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
	private Client client;
	@OneToMany(mappedBy="commande", fetch=FetchType.LAZY)
	private List<LigneCommande>ligneCommandes;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(String numero, LocalDate date, BigDecimal prixTotal, Long etat, Client client) {
		super();
		this.numero = numero;
		this.date = date;
		this.prixTotal = prixTotal;
		this.etat = etat;
		this.client = client;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
}
