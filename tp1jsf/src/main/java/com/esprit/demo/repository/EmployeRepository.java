package com.esprit.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.demo.entities.Employe;

@Repository
	public interface EmployeRepository extends CrudRepository<Employe, Integer> {
	@Query("SELECT e FROM Employe e WHERE e.email=:email and e.password=:password")
	public Employe getEmployeByEmailAndPassword(@Param("email")String login, @Param("password")String password);
}
