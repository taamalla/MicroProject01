package com.esprit.examen.entities;


/*Q7*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sprint {
	private static final long serialVersionUID = -1396669830860400871L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	String description;
	@Temporal(TemporalType.DATE)
	Date startDate;
	/*Q8*/
	Project project;
	
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Sprint(int id, String description, Date startDate) {
		super();
		this.id = id;
		this.description = description;
		this.startDate = startDate;
	}
	
	
	public Sprint(int id, String description, Date startDate, Project project) {
		super();
		this.id = id;
		this.description = description;
		this.startDate = startDate;
		this.project = project;
	}
	public Sprint() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sprint [id=" + id + ", description=" + description + ", startDate=" + startDate + ", project=" + project
				+ "]";
	}
	
	
	
}
