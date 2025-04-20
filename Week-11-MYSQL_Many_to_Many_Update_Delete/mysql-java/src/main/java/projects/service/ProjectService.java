package projects.service;

import projects.entity.Project;
import projects.exception.DBException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.ProjectDAO;

public class ProjectService {
	private ProjectDAO projectDAO = new ProjectDAO();

	public Project addProject(Project project) {
		return projectDAO.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDAO.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
		return projectDAO.fetchProjectById(projectId).orElseThrow(
				() -> new NoSuchElementException(
				"Project with project ID=" + projectId +
				" does not exist."));
	}

	public void modifyProjectDetails(Project project) {
		if (!projectDAO.modifyProjectDetails(project)) {
			throw new DBException("Project with ID=" + project.getProjectId() + " does not exist.");
		}	
	}

	public void deleteProject(Integer projectId) {
		if (!projectDAO.deleteProject(projectId)) {
			throw new DBException("Project with ID=" + projectId + " does not exist.");
		}		
	}

}
