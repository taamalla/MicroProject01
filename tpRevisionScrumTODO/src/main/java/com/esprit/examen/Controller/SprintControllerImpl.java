package com.esprit.examen.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.examen.entities.Sprint;
import com.esprit.examen.services.SprintService;


@RestController
public class SprintControllerImpl {
	@Autowired
	SprintService sprintService;
	
	// http://localhost:8081/SpringMVC/servlet/addSprintAndAssignToProject/Sprint Mandat/27-12-2020/1
	@PostMapping("/addSprintAndAssignToProject/{idProject}")
	@ResponseBody
	public void addSprintAndAssignToProject(@RequestBody Sprint sprint, @PathVariable int idProject)
	{
	sprintService.addSprintAndAssignToProject(sprint.getDescription(),sprint.getStartDate(),idProject);
	}
}
