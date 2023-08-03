package com.esprit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.demo.entities.Employe;
import com.esprit.demo.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements IEmployeService {
	@Autowired
	EmployeRepository employeRepository;

	@Override
	public Employe authenticate(String login, String password) {
		return employeRepository.getEmployeByEmailAndPassword(login, password);
	}
}
