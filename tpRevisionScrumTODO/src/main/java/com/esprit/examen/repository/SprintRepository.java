package com.esprit.examen.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.esprit.examen.entities.Sprint;


/*Q26*/
public interface SprintRepository extends JpaRepository<Sprint, Integer> {

	/*Q27 */
	 
	void addSprintAndAssignToProject(@Param("description") String description, @Param("startDate") Date startDate, @Param("idProject") int idProject);	
}
