package com.esprit.examen.services;

import java.util.List;

import com.esprit.examen.entities.Project;

public interface IProjectService {
	public void addProject(Project project);
	public List<Project> getAllProjects();
	public List<Project> getProjectsByUser(int userId);
}
