package com.esprit.demo.service;

import com.esprit.demo.entities.Employe;

public interface IEmployeService {
	public Employe authenticate(String login, String password) ;
}
