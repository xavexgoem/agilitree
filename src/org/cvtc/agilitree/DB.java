package org.cvtc.agilitree;

import java.sql.*;

// this might cause issues if we need more than 1 DB
// this is accessed solely through DB.getInstance()
public class DB {
	private static DB instance = null;
	
	private Connection connection = null;
	
	private DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(
					 "jdbc:mysql://localhost/agilitree?user=root" +
					 "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DB getInstance() {
		if (instance == null) {
			instance = new DB();
		}
		return instance;
	}
	
	public ResultSet query(String queryText) {
		try {
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery(queryText);
			return results;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
