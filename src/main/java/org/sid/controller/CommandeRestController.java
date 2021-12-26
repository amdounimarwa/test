package org.sid.controller;

import java.util.List;
import org.sid.dao.CommandeRepository;
import org.sid.entities.Client;
import org.sid.entities.Commande;
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
@Api("/commandes")
@RestController
public class CommandeRestController {
	@Autowired
	private CommandeRepository commandeRepository;
    @GetMapping(value="/listCommandes")
    @ApiOperation(value="Renvoie la liste des commandes", notes="cette methode permet de chercher et renvoyer la liste des commandes qui existe dans la BD", response=Commande.class)
	public List<Commande> ListClients(){
		return commandeRepository.findAll();
	}
	@GetMapping(value="listClients/{numero}")
	@ApiOperation(value="Rechercher une commande à partir de son code", notes="cette methode permet de rechercher une commande a partir de son code", response=Commande.class)
	public Commande listClients(String numero) {
		return commandeRepository.findById(numero).get();
		
	}
	
	@PutMapping(value="/"
			+ ""
			+ "/{numero}")
	@ApiOperation(value="Mettre à jour une commande a partir de son numero", notes="cette methode permet de mettre à jour une commande à partie de son numero", response=Commande.class)
	public Commande update (@PathVariable(name="numero") String numero, @RequestBody Commande c ) {
		c.setNumero(numero);
		return commandeRepository.save(c);
		
	}
	@PostMapping(value="listCommandes")
	@ApiOperation(value="Enregistrer une commande", notes="cette methode permet denregistrer une commande", response=Commande.class)
	public Commande save(@RequestBody Commande c) {
		return commandeRepository.save(c);
	}
	
	@DeleteMapping(value="/listCommandes/{numero}")
	@ApiOperation(value="Suppression d'une commande", notes="cette methode permet de supprimer un commande par son numero", response=Commande.class)
	public void delete(@PathVariable(name="numero") String numero) {
		commandeRepository.deleteById(numero);
		
	}
	


}
