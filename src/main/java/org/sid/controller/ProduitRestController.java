package org.sid.controller;

import java.util.List;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Client;
import org.sid.entities.Produit;
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
@Api(value="/produits")
@RestController
public class ProduitRestController {
	@Autowired
	private ProduitRepository produitRepository;
    @GetMapping(value="/listProduits")
    @ApiOperation(value="Renvoie la liste des produits", notes="cette methode permet de chercher et renvoyer la liste des produits qui existe dans la BD", response=Produit.class)
	public List<Produit> ListProduits(){
		return produitRepository.findAll();
	}
	@GetMapping(value="listProduits/{code}")
	@ApiOperation(value="Rechercher un produit à partir de son code", notes="cette methode permet de rechercher un produit a partir de son code", response=Produit.class)
	public Produit listProduits(String code) {
		return produitRepository.findById(code).get();
		
	}
	
	@PutMapping(value="/"
			+ ""
			+ "/{code}")
	@ApiOperation(value="Mettre à jour un produit a partir de son code", notes="cette methode permet de mettre à jour un produit à partir de son code", response=Produit.class)
	public Produit update (@PathVariable(name="code") String code, @RequestBody Produit p ) {
		p.setCode(code);
		return produitRepository.save(p);
		
	}
	@PostMapping(value="listProduits")
	@ApiOperation(value="Enregistrer un produit", notes="cette methode permet denregistrer un produit", response=Produit.class)
	public Produit save(@RequestBody Produit p) {
		return produitRepository.save(p);
	}
	
	@DeleteMapping(value="/listProduits/{code}")
	@ApiOperation(value="Suppression d'un produit", notes="cette methode permet de supprimer un produit par son code", response=Produit.class)
	public void delete(@PathVariable(name="code") String code) {
		produitRepository.deleteById(code);
		
	}
	


}
