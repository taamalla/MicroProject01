package com.esprit.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.CentreCommercial;


@Repository
public interface CentreCommercialRepository extends JpaRepository<CentreCommercial, Long> {

}
