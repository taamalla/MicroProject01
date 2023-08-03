package com.esprit.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Project;



@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

	/*Q24*/
    public List<Project> getProjectsByUser(@Param("userId") int userId);

	
}
