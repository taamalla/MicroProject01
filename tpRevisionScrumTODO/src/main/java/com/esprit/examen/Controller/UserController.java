package com.esprit.examen.Controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.esprit.examen.entities.Project;
import com.esprit.examen.entities.Role;
import com.esprit.examen.entities.User;
import com.esprit.examen.services.ProjectService;
import com.esprit.examen.services.UserService;

@Scope(value = "session")
@Controller(value = "/*Q32*/")
@ELBeanName(value = "/*Q32*/")
@Join(path = "/", to = "/login.jsf")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	ProjectService projectService;

	private String login;
	private String password;
	private User user;
	private Boolean loggedIn;
	private User authenticatedUser;
	private Role role;
	private List<Project> projects;

	public List<Project> selectProjectsByUser() {
		return projectService.getProjectsByUser(authenticatedUser.getId());
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public User getAuthenticatedUser() {
		return authenticatedUser;
	}

	public void setAuthenticatedUser(User authenticatedUser) {
		this.authenticatedUser = authenticatedUser;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public String doLogin() {
		String navigateTo = "null";
		authenticatedUser = userService.authenticate(login, password);
		if (authenticatedUser != null
				&& (authenticatedUser.getRole() == Role.CLIENT || authenticatedUser.getRole() == Role.PRODUCT_OWNER)) {
            /*Q33*/
			loggedIn = true;
		} else if (authenticatedUser != null && (authenticatedUser.getRole() == Role.DEVELOPER
				|| authenticatedUser.getRole() == Role.SCRUM_MASTER)) {
			navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";
			loggedIn = true;
		} else {
			FacesMessage facesMessage = new FacesMessage(
					"Login Failed: please check your username/password and try again.");
			FacesContext.getCurrentInstance().addMessage("form:btn", facesMessage);
		}
		return navigateTo;
	}

	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		/*Q34*/
	}

	public List<Project> getEmployes() {
		projects = projectService.getProjectsByUser(authenticatedUser.getId());
		return projects;
	}

	public List<Project> getProjects() {
		projects = projectService.getAllProjects();
		return projects;
	}

}
