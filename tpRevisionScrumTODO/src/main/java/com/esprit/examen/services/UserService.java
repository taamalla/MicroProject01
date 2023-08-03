package com.esprit.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Project;
import com.esprit.examen.entities.User;
import com.esprit.examen.repository.ProjectRepository;
import com.esprit.examen.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	UserRepository userRepository;
	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public User authenticate(String login, String password) {
		
		return userRepository.getUsereByEmailAndPassword(login, password);
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		/*Q11*/
		
	}

	@Override
	public void assignProjectToUser(int projectId, int userId) {
		Project projectEntity = projectRepository./*Q15*/.get();
		User userEntity = userRepository./*Q16*/.get();
		/*Q17*/
		userRepository.save(userEntity);
		
	}

}
