package org.sid.controller;

import java.util.List;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
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
import io.swagger.annotations.ApiResponses;
@Api("/clients")
@RestController
public class ClientRestController {
	 @Autowired
		private ClientRepository clientRepository;
	    @GetMapping(value="/listClients")
	    @ApiOperation(value="Renvoie la liste des clients", notes="cette methode permet de chercher et renvoyer la liste des clients qui existe dans la BD", response=Client.class)
		public List<Client> ListClients(){
			return clientRepository.findAll();
		}
		@GetMapping(value="listClients/{code}")
		@ApiOperation(value="Rechercher un client à partir de son code", notes="cette methode permet de rechercher un client a partir de son code", response=Client.class)
		public Client listClients(String code) {
			return clientRepository.findById(code).get();
			
		}
		
		@PutMapping(value="/"
				+ ""
				+ "/{code}")
		@ApiOperation(value="Mettre à jour un client a partir de son Id", notes="cette methode permet de mettre à jour un client", response=Client.class)
		public Client update (@PathVariable(name="code") String code, @RequestBody Client c ) {
			c.setCode(code);
			return clientRepository.save(c);
			
		}
		@PostMapping(value="listClients")
		@ApiOperation(value="Enregistrer un client", notes="cette methode permet denregistrer un client", response=Client.class)
		public Client save(@RequestBody Client c) {
			return clientRepository.save(c);
		}
		
		@DeleteMapping(value="/listClients/{code}")
		@ApiOperation(value="Suppression d'un client", notes="cette methode permet de supprimer un client par son code", response=Client.class)
		public void delete(@PathVariable(name="code") String code) {
			clientRepository.deleteById(code);
			
		}
		

	}

	    


