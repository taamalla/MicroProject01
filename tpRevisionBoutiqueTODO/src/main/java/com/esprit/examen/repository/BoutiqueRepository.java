package com.esprit.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Boutique;
import com.esprit.examen.entities.Categorie;
import com.esprit.examen.entities.Client;
/*Q6*/
public interface BoutiqueRepository extends JpaRepository<Boutique, Long>{
	
	/*Q7*/
	@Query(value = "INSERT INTO Boutique (categorie, nom, centre_commercial_id) VALUES (:categorie, :nom, :centreCommercialId)", nativeQuery= true)
    /*Q8*/
	@Query("SELECT b FROM Boutique b join b.centreCommercial c where c.id=:idCentre")
    public List<Boutique> listedeBoutiques(@Param("idCentre") Long idCentre);
	
}
