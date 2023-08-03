package com.esprit.examen.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Categorie;
import com.esprit.examen.entities.Client;
import com.esprit.examen.entities.Genre;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	/*Q14*/
    public List<Client> listedeClients(@Param("idBoutique") Long idBoutique);
	
	@Query("SELECT c FROM Client c join c.boutiques b where b.categorie=:categorie")
	public List<Client> listeDeClientsParCategorie(@Param("categorie") Categorie categorie);

	 
	/*Q16*/
	public Long statistiquesByGendre(@Param("genre") Genre genre);

	
	}



