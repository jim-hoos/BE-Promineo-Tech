package projects;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import projects.dao.DBConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			// why make a DB without a table and data?
			// run the week07CodingAssignment.sql file beforehand
			System.out.println("----------------------\nTable project was added along with data");
			Statement statement = conn.createStatement();
			ResultSet resultSet = null;
			// define the select query for the table
			resultSet = statement.executeQuery("SELECT * FROM project");
			// read the results from the table and printout
			System.out.println("project data:");
		    while (resultSet.next()) {
		    	int id = resultSet.getInt("project_id");
		    	String name = resultSet.getString("project_name");
		    	System.out.println("ID: " + id + ", Name: " + name);
		    }
		} catch (SQLException e) {
			// Did you run week07CodingAssignment.sql?
			e.printStackTrace();
		}

	}

}
