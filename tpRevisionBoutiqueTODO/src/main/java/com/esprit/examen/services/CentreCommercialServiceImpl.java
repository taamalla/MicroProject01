package com.esprit.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.CentreCommercial;
import com.esprit.examen.repository.CentreCommercialRepository;

@Service
public class CentreCommercialServiceImpl implements ICentreCommercialService{

	@Autowired
	CentreCommercialRepository centreCommercialRepository;

	@Override
	public void ajouCentre(CentreCommercial centre) {
		centreCommercialRepository.save(centre);
		
	}
}
