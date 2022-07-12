package FileHandingOperations;

import java.io.File;

public class FileHandlingmkdirMethod {

	public static void main(String[] args) {
		//Create new file
		File file=new File("C:\\Example\\another");
		
		//Check if the directory can be created 
		//using the abstract path name
		if(file.mkdir()) {
			//display that the directory/folder is created 
			//as the function returns true
			System.out.println("Directory created");
		}else {
			//display that the directory can not be created
			// as the function return false
			System.out.println("Directoty can not be created");
		}

	}
}