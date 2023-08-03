package com.esprit.examen.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.examen.entities.Categorie;
import com.esprit.examen.entities.Client;
import com.esprit.examen.entities.Genre;
import com.esprit.examen.services.IClientService;

@RestController
public class ClientRestController {

	@Autowired
	IClientService clientService;
	
	// http://localhost:8081/SpringMVC/servlet/ajouterEtAffecterClientBoutiques/[1]
		@PostMapping("/ajouterEtAffecterClientBoutiques")
		@ResponseBody
		public void ajouterEtAffecterClientBoutiques(@RequestBody Client client)
		{
		/*	for (int i = 0; i < client.getBoutiques().size(); i++) {
				
			}*/
			System.out.println("client");
			System.out.println(client);
			clientService.ajouterEtAffecterClientBoutiques(client, new ArrayList<Long>(1));
		}
		
		// http://localhost:8081/SpringMVC/servlet/listedeClients/1
		/*Q15*/
		@ResponseBody
		public List<Client> listedeClients(@PathVariable("idBoutique") long idBoutique) {
			return clientService.listedeClients(idBoutique);

		}
		
		// http://localhost:8081/SpringMVC/servlet/listeDeClientsParCategorie/Sport
				@GetMapping("/listeDeClientsParCategorie/{categorie}")
				@ResponseBody
				public List<Client> listeDeClientsParCategorie(@PathVariable("categorie") Categorie categorie) {
					return clientService.listeDeClientsParCategorie(categorie);

				}
				
				// http://localhost:8081/SpringMVC/servlet/statistiques
				@GetMapping("/statistiques")
				@ResponseBody
				public Map<Genre, Long> statistiques() {
					System.out.println("statistiquess");
					/*Q19*/

				}
				
}
