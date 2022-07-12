package FileHandingOperations;

import java.io.FileReader;
import java.util.Scanner;

public class FileHandlingDynamically {

	public static void main(String[] args) {
		try {
			//Create an object for the new file
			FileReader input = new FileReader("Newfile.txt");
			Scanner dataReader=new Scanner(System.in);
			
			System.out.println("Enter some data: ");
			while(dataReader.hasNext()) {
				String data=dataReader.nextLine();
				System.out.println(data);
			}
			input.read();
			dataReader.close();
			input.close();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}