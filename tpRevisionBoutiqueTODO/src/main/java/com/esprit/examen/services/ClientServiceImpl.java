package com.esprit.examen.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Boutique;
import com.esprit.examen.entities.Categorie;
import com.esprit.examen.entities.Client;
import com.esprit.examen.entities.Genre;
import com.esprit.examen.repository.BoutiqueRepository;
import com.esprit.examen.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	ClientRepository clientRepository;
	@Autowired
	BoutiqueRepository boutiqueRepository;
	@Transactional
	public void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques) {
		// TODO Auto-generated method stub
		List<Boutique> boutiques = new ArrayList<>();
		for (int i = 0; i < idBoutiques.size(); i++) {
			Boutique boutique = boutiqueRepository.findById((long) i).get();
			boutiques.add(boutique);
		}
		client.setBoutiques(boutiques);
		clientRepository.save(client);
		
	}
	@Override
	public List<Client> listedeClients(Long idBoutique) {
		// TODO Auto-generated method stub
		return clientRepository.listedeClients(idBoutique);
	}
	@Override
	public List<Client> listeDeClientsParCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return clientRepository.listeDeClientsParCategorie(categorie);
	}
	@SuppressWarnings("null")
	@Transactional
	public Map<Genre, Long> statistiques() {
		// TODO Auto-generated method stub
		 Map<Genre, Long> tabStats = new HashedMap();
	for (Genre genre : /*Q18*/) {
		/*Q17*/
	}
		return tabStats;
	}
}
