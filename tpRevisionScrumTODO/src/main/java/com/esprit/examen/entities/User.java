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

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = -1396669830860400871L;

	/*Q9*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	String email;
	String pwd;
	String fName;
	String lName;
	@Enumerated(EnumType.STRING)
	Role role;
	@ManyToMany
	private List<Project> projects;
	
	
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", pwd=" + pwd + ", fName=" + fName + ", lName=" + lName
				+ ", role=" + role + "]";
	}
	public User(int id, String email, String pwd, String fName, String lName, Role role) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
		this.fName = fName;
		this.lName = lName;
		this.role = role;
	}
	
	
	public User(int id, String email, String pwd, String fName, String lName, Role role, List<Project> projects) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
		this.fName = fName;
		this.lName = lName;
		this.role = role;
		this.projects = projects;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
