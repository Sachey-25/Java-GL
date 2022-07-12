package FileHandingOperations;

import java.io.FileWriter;

public class FileHandlingWritemethod {

	public static void main(String[] args) {
		
		String data="This is the data in the newfile created";
		String info="My name is Sachin"
			+ "/n"	+ "We are dealing with the file handling"
			+ "/n"	+ "We have successfuly added info to the text file"
			+ "/n"	+ "created";
		try {
			// Create an object to write the file 
			// Already created one.
			FileWriter output=new FileWriter("Newfile.txt");
			
			//write the string to the file
			output.write(data);
			output.write(info);
			output.write("Sachin");
			System.out.println("Data is written/stored in the file");
			
			//Close the file
			output.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}