package com.esprit.examen.services;

import java.util.Date;

public interface ISprintService {

	public void addSprintAndAssignToProject(String description, Date startDate, int idProject);

}
