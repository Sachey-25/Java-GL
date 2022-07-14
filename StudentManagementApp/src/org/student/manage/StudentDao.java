package org.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		try {
			//JBDC code..
			Connection connection=ConnectionProgram.createCP();
			String query="insert into student (sname, sphone, scity) values (?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=connection.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(1, st.getStudentPhone());
			pstmt.setString(1, st.getStudentCity());
			
			//execute
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}