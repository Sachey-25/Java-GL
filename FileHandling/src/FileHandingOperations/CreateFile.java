package FileHandingOperations;

//import java.io.File;
import java.io.FileReader;

public class CreateFile {

	public static void main(String[] args) {
		//Create an object for the current location
		//File file=new File("Newfile.txt");
//		
//		try {
//			//trying to create a file based on the object
//			//boolean value=file.createNewFile();
//			//createNewfile : Atomically creates a new, empty file named by this 
//			//abstract pathname if and only if a file with this name does not yet exist
//			if(file.delete()) {
//				System.out.println("The new file is deleted");
//			}else {
//				System.out.println("unexpected error found");
//			}
//		}
//		catch(Exception e) {
//			e.getStackTrace();
//			System.out.println("Exception handled file can't be created");
//		}
		
		//I wanted to open the file now!!!!
		char[] array=new char[1000];
		//Create an object to read the file
		try {
			FileReader input = new FileReader("Newfile.txt");
			//Read the letters/characters
			input.read(array); // ----------------> file is open
			System.out.println("Data in the file");
			System.out.println(array);
			
			//Close the file too =====> important action FH
			input.close();		
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}