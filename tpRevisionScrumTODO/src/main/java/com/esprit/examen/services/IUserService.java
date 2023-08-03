package com.esprit.examen.services;

import com.esprit.examen.entities.User;


public interface IUserService {
	public void addUser(User user);
	void assignProjectToUser(int projectId, int userId);
	public User authenticate(String login, String password);
}
