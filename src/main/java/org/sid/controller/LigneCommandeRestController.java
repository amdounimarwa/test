package org.sid.controller;

import java.util.List;

import org.sid.dao.LigneCommandeRepository;
import org.sid.entities.Client;
import org.sid.entities.LigneCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="/lignescommandes")
@RestController
public class LigneCommandeRestController {
	@Autowired
	private LigneCommandeRepository ligneRepository;
	 @GetMapping(value="/listLignes")
	 @ApiOperation(value="Renvoie la liste des lignes de commandes", notes="cette methode permet de chercher et renvoyer la liste des lignes de commande qui existe dans la BD", response=LigneCommande.class)
	public List<LigneCommande> ListLigneCommandes(){
		return ligneRepository.findAll();
	}
	@GetMapping(value="listLignes/{qte}")
	@ApiOperation(value="Rechercher une ligne de commande à partir de son qte", notes="cette methode permet de rechercher une ligne de commande a partir de son qte", response=LigneCommande.class)
	public LigneCommande listLignes(Long qte) {
	
		return ligneRepository.findById(qte).get();
		
	}
	
	@PutMapping(value="/"
			+ ""
			+ "/{qte}")
	@ApiOperation(value="Mettre à jour une ligne de cmmande a partir de sa qte", notes="cette methode permet de mettre à jour une ligne de commande par sa qtet", response=LigneCommande.class)
	public LigneCommande update (@PathVariable(name="qte") Long qte, @RequestBody LigneCommande l ) {
		l.setQte(qte);
		return ligneRepository.save(l);
		
	}
	@PostMapping(value="listLignes")
	@ApiOperation(value="Enregistrer une ligne de commande", notes="cette methode permet d'enregitrer une ligne de commande dans la BD", response=LigneCommande.class)
	public LigneCommande save(@RequestBody LigneCommande l) {
		return ligneRepository.save(l);
	}
	
	@DeleteMapping(value="/listLignes/{qte}")
	@ApiOperation(value="Suppression d'une ligne de commande", notes="cette methode permet de supprimer une commande par sa qte", response=LigneCommande.class)
	public void delete(@PathVariable(name="qte") Long qte) {
		ligneRepository.deleteById(qte);
		
	}
	


}
