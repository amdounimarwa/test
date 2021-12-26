package org.sid.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client implements Serializable {
	@Id
	private String code;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String vile;
	private Long codePostale;
	private String tel;
	private String fax;
	private String gsm;
	private String email;
	@OneToMany(mappedBy="client", fetch=FetchType.LAZY)
	private List<Commande>commandes;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String code, String nom, String prenom, LocalDate dateNaissance, String adresse, String vile,
			Long codePostale, String tel, String fax, String gsm, String email) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.vile = vile;
		this.codePostale = codePostale;
		this.tel = tel;
		this.fax = fax;
		this.gsm = gsm;
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVile() {
		return vile;
	}
	public void setVile(String vile) {
		this.vile = vile;
	}
	public Long getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(Long codePostale) {
		this.codePostale = codePostale;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	

}
