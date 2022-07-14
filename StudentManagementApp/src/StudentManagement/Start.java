package StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.student.manage.Student;
import org.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to Student Management App");
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// 1 // 2 // 3 // 4 --- parseInt ---- ASCII numbers
		while(true){
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete Student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to exit app");		
			int c=Integer.parseInt(br.readLine());	
			
			if(c==1) {
				//add student
				System.out.println("Enter Studentname: ");
				String name=br.readLine();
				System.out.println("Enter StudentPhone: ");
				String phone=br.readLine();
				System.out.println("Enter Student city: ");
				String city=br.readLine();
				
				//Create student object to store student details
				Student st=new Student(name, phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added successfuly..!");
				}else {
					System.out.println("Something went wrong try again..!!");
				}
				System.out.println(st);
			
				
			}else if(c==2) {			
				//delete student
				
			}else if(c==3) {				
				//display student
				
			}else if(c==4) {				
				//exit the app
				
				break;
			}else {
				
			}
		}
		System.out.println("Thank you for using my application");
		System.out.println("See you soon bye bye..!");
	}
	}