package com.esprit.examen.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Boutique implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String nom;
	/*Q1*/
	Categorie categorie;
	/*Q2*/
	@JsonIgnore
	CentreCommercial centreCommercial;
	/*Q3*/
	@JsonIgnore
	private List<Client> clients;

	public CentreCommercial getCentreCommercial() {
		return centreCommercial;
	}
	public void setCentreCommercial(CentreCommercial centreCommercial) {
		this.centreCommercial = centreCommercial;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
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
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "Boutique [id=" + id + ", nom=" + nom + ", categorie=" + categorie + "]";
	}
	public Boutique(Long id, String nom, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.categorie = categorie;
	}
	public Boutique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
