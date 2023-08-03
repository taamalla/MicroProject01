package com.esprit.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.examen.entities.Boutique;
import com.esprit.examen.entities.Client;
import com.esprit.examen.services.IBoutiqueService;

/*Q11*/
public class BoutiqueRestController {

	@Autowired
	IBoutiqueService boutiqueService;
	// http://localhost:8081/SpringMVC/servlet/ajouterEtaffecterListeboutique/1
	/*Q12*/("/ajouterEtaffecterListeboutique/{idCentre}")
	@ResponseBody
	public void ajouterEtaffecterListeboutique(/*Q13*/)
	{
		boutiqueService.ajouterEtaffecterListeboutique(lb,idCentre);
	}
	
	// http://localhost:8081/SpringMVC/servlet/listedeBoutiques/1
	@GetMapping("/listedeBoutiques/{idCentre}")
	@ResponseBody
	public List<Boutique> listedeBoutiques(@PathVariable("idCentre") Long idCentre) {
		return boutiqueService.listedeBoutiques(idCentre);

	}
}
