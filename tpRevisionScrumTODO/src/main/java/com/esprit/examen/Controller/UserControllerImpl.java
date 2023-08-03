package com.esprit.examen.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.examen.entities.User;
import com.esprit.examen.services.IUserService;


@RestController
public class UserControllerImpl {
	/*Q12*/
	IUserService userService;
	
	
	// http://localhost:8081/SpringMVC/servlet/addUser
	/*Q13*/
	@ResponseBody
	public User addUser(/*Q14*/)
	{
		userService.addUser(user);
		return user;
	}
	
	// http://localhost:8081/SpringMVC/servlet/assignProjectToUser/1/1
    /*Q18*/ /*Q20*/
	public void affecterDepartementAEntreprise(/*Q19*/("projectId")int projectId, /*Q19*/("userId")int userId) {
    	userService.assignProjectToUser(projectId, userId);
	}

}
