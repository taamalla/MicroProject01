package com.esprit.examen.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Boutique;
import com.esprit.examen.repository.BoutiqueRepository;

@Service
public class BoutiqueServiceImpl implements IBoutiqueService{

	@Autowired
	BoutiqueRepository boutiqueRepository;
	@Transactional
	public void ajouterEtaffecterListeboutique(List<Boutique> lb, Long idCentre) {
		for (int i = 0; i < lb.size(); i++) {
			/*Q9*/
			boutiqueRepository.ajouterEtaffecterListeboutique(/*Q10*/);
	
		}
		
	}
	@Override
	public List<Boutique> listedeBoutiques(Long idCentre) {
		return boutiqueRepository.listedeBoutiques(idCentre);
		
	}
	


}
