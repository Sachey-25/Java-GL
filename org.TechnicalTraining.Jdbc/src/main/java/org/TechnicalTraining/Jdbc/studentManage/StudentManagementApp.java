package org.TechnicalTraining.Jdbc.studentManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentManagementApp {

	public static void main(String[] args) {
		Connection connection;
		
		//load the driver 
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage"
					+ "user=root&password=root");
			System.out.println("Successful connection to mySql");
			//ExecuteQuery used to fetch the data
			Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet=statement.executeQuery("Select * from students");
			
			while(resultSet.next()) {
				System.out.println(
						resultSet.getInt("sid") + " " + 
						resultSet.getString("sname") + " " +
						resultSet.getInt("sphone") + " " +
						resultSet.getString("scity"));
			}
			
		}catch(Exception e) {
			System.out.println("Exception handled");
			
		}
		

	}
}