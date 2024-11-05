package application.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectDatabase {
	
	private Connection connection;
	private static final String URL = "jdbc:sqlite:Waste_Reduction_App/data/projects.sqlite";

	public ProjectDatabase() {
		this.openConnection();
		this.createDB();
	}

	private void openConnection() {
		if (this.connection == null) {
			try {
				this.connection = DriverManager.getConnection(URL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void createDB() {
		this.openConnection();
		Statement sm = null;
		try {
			sm = this.connection.createStatement();

			String userTable = "CREATE TABLE IF NOT EXISTS users (" +
					"id INTEGER PRIMARY KEY AUTOINCREMENT, " +
					"username TEXT NOT NULL, " +
					"password TEXT NOT NULL" + 
					")";
			
			sm.execute(userTable);
		} catch (SQLException e) {
			e.printStackTrace();
			this.closeConnection();
		} finally {
			try {
				if (sm != null) {
					sm.close();
					this.closeConnection();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
				this.closeConnection();
			}
		}
	}

	private void closeConnection() {
		try {
			if (this.connection != null) {
				this.connection.close();
				this.connection = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}