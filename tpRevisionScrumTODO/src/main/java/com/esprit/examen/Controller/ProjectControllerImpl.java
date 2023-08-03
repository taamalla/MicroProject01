package com.esprit.examen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.examen.entities.Project;
import com.esprit.examen.services.IProjectService;

@RestController
public class ProjectControllerImpl {

	/*Q23*/

	// http://localhost:8081/SpringMVC/servlet/addProject
	@PostMapping("/addProject")
	@ResponseBody
	public Project addProject(@RequestBody Project project) {
		projectService.addProject(project);
		return project;
	}

	// http://localhost:8081/SpringMVC/servlet/getAllProjects
	/*Q22*/
	@ResponseBody
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}

	// http://localhost:8081/SpringMVC/servlet/getProjectsByUser/1
	@GetMapping("/getProjectsByUser/{userId}")
	@ResponseBody
	public List<Project> getProjectsByUser(/*Q25*/) {
		return projectService.getProjectsByUser(userId);

	}
}
