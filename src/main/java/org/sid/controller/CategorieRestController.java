package org.sid.controller;

import java.util.List;
import org.sid.dao.CategorieRepository;
import org.sid.entities.Categorie;
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
@Api(value="/categories")
@RestController
public class CategorieRestController {
	 @Autowired
		private CategorieRepository categorieRepository;
	    @GetMapping(value="/listCategories")
	    @ApiOperation(value="Renvoie la liste des categories", notes="cette methode permet de chercher et renvoyer la liste des categories qui existent dans la BD", response=Categorie.class)
		public List<Categorie> ListCategories(){
			return categorieRepository.findAll();
		}
		@GetMapping(value="listCategories/{code}")
		@ApiOperation(value="Rechercher une categorie à partir de son code", notes="cette methode permet de rechercher une categorie a partir de son code", response=Client.class)
		public Categorie listClients(String code) {
			return categorieRepository.findById(code).get();
			
		}
		
		@PutMapping(value="/"
				+ ""
				+ "/{code}")
		@ApiOperation(value="Mettre à jour une categorie a partir de son Id", notes="cette methode permet de mettre à jour une catégorie par son code", response=Categorie.class)
		public Categorie update (@PathVariable(name="code") String code, @RequestBody Categorie c ) {
			c.setCode(code);
			return categorieRepository.save(c);
			
		}
		@PostMapping(value="listCategories")
		@ApiOperation(value="Enregistrer une catégorie", notes="cette methode permet denregistrer une catégorie", response=Categorie.class)
		public Categorie save(@RequestBody Categorie c) {
			return categorieRepository.save(c);
		}
		
		@DeleteMapping(value="/listCategories/{code}")
		@ApiOperation(value="Suppression d'une catégorie", notes="cette methode permet de supprimer une catégorie par son code", response=Categorie.class)
		public void delete(@PathVariable(name="code") String code) {
			categorieRepository.deleteById(code);
			
		}
		

	}


