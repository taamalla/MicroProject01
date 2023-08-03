package com.esprit.examen.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CentreCommercial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String nom;
	String adresse;
	String login;
	String password;
	/*Q4*/
	@JsonIgnore
	private List<Boutique> boutiques;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public List<Boutique> getBoutiques() {
		return boutiques;
	}
	public void setBoutiques(List<Boutique> boutiques) {
		this.boutiques = boutiques;
	}
	@Override
	public String toString() {
		return "CentreCommercial [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", login=" + login
				+ ", password=" + password + "]";
	}
	public CentreCommercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CentreCommercial(Long id, String nom, String adresse, String login, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.login = login;
		this.password = password;
	}
	
	
}
