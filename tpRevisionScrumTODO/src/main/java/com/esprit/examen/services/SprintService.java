package com.esprit.examen.services;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.repository.SprintRepository;

@Service
public class SprintService implements ISprintService{

	@Autowired
	SprintRepository sprintRepository;
	@Transactional
	public void addSprintAndAssignToProject(String description, Date startDate, int idProject)
	{
		sprintRepository.addSprintAndAssignToProject(description, startDate,idProject);
		
	}

}
