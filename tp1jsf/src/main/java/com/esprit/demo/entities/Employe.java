package com.esprit.demo.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe implements Serializable {
	
	private static final long serialVersionUID = -1396669830860400871L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String prenom;
	
	private String nom;
	
	private String email;

	private String password;
	
	private boolean isActif;
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Role role;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isActif() {
		return isActif;
	}



	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	public Employe(int id, String prenom, String nom, String email, String password, boolean isActif, Role role) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.isActif = isActif;
		this.role = role;
	}



	@Override
	public String toString() {
		return "Employe [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", password="
				+ password + ", isActif=" + isActif + ", role=" + role + "]";
	}



	public Employe() {
		super();
	}
	
		
	

	
	
	
	
}
