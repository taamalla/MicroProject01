package com.esprit.examen.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Project /*Q2*/ {
	private static final long serialVersionUID = -1396669830860400871L;

	@Id
	/*Q3*/
	private int id;
	String title;
	String description;
	/*Q4*/
	@JsonIgnore
	private List<User> users;
	/*Q5*/
	@JsonIgnore
	private List<Sprint> sprints;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Sprint> getSprints() {
		return sprints;
	}

	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
