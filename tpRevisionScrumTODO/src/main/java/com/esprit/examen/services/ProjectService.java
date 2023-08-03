package com.esprit.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.examen.entities.Project;
import com.esprit.examen.repository.ProjectRepository;

@Service
public class ProjectService implements IProjectService  {

	@Autowired
	ProjectRepository projectRepository;
	@Override
	public void addProject(Project project) {
		projectRepository.save(project);
		
	}
	@Override
	public List<Project> getAllProjects() {
		/*Q21*/
	}
	@Override
	public List<Project> getProjectsByUser(int userId) {
		return projectRepository.getProjectsByUser(userId);
	}

}
