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

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String nom;
	@Enumerated(EnumType.STRING)
	Genre genre;
	/*Q5*/
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
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", genre=" + genre + "]";
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long id, String nom, Genre genre) {
		super();
		this.id = id;
		this.nom = nom;
		this.genre = genre;
	}
	
	
	public Client(Long id, String nom, Genre genre, List<Boutique> boutiques) {
		super();
		this.id = id;
		this.nom = nom;
		this.genre = genre;
		this.boutiques = boutiques;
	}
	public List<Boutique> getBoutiques() {
		return boutiques;
	}
	public void setBoutiques(List<Boutique> boutiques) {
		this.boutiques = boutiques;
	}
	
	
}
