package org.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProgram {
	
	static Connection connection;	
	
	public static Connection createCP(){		
		//Exception --- I would like to check whether the database is loading or no
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create the connection.....
			String user="root";
			String password="root";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			connection=DriverManager.getConnection(url, user, password);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}