package com.esprit.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.examen.entities.CentreCommercial;
import com.esprit.examen.services.ICentreCommercialService;

@RestController
public class CentreCommercialRestController {
@Autowired
ICentreCommercialService centreCommercialService;

//http://localhost:8081/SpringMVC/servlet/ajouCentre
	@PostMapping("/ajouCentre")
	@ResponseBody
	public CentreCommercial ajouCentre(@RequestBody CentreCommercial centreCommercial) {
		centreCommercialService.ajouCentre(centreCommercial);
		return centreCommercial;
	}
}
