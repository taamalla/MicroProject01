package com.esprit.examen.services;

import java.util.List;
import java.util.Map;

import com.esprit.examen.entities.Categorie;
import com.esprit.examen.entities.Client;
import com.esprit.examen.entities.Genre;

public interface IClientService {
	void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques);
	List<Client> listedeClients(Long idBoutique);
	List<Client> listeDeClientsParCategorie(Categorie categorie);
	Map<Genre, Long> statistiques ();
}
