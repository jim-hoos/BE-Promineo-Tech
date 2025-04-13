package projects.service;

import projects.entity.Project;

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

}
