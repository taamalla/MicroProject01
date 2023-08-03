package com.esprit.examen.services;

import java.util.List;

import com.esprit.examen.entities.Boutique;

public interface IBoutiqueService {
	void ajouterEtaffecterListeboutique (List<Boutique> lb, Long idCentre);
	List<Boutique> listedeBoutiques(Long idCentre);
}
