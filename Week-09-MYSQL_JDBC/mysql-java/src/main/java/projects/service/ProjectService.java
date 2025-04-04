package projects.service;

import projects.entity.Project;
import projects.dao.ProjectDAO;

public class ProjectService {
	private ProjectDAO projectDAO = new ProjectDAO();

	public Project addProject(Project project) {
		return projectDAO.insertProject(project);
	}

}
