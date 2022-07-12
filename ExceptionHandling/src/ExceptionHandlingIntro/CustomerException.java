package ExceptionHandlingIntro;

class MyException extends Exception{
	String stringone;
	/* 
	 * Constructor of customer exception class
	 * here I am copying the message that we are passing while throwing the
	 * exception to a string and then displaying that string along with the 
	 * message
	 */
	MyException(String stringtwo){
		stringone=stringtwo;
	}
	public String toString() {
		return ("MyException Occurred: "+ stringone);
	}
}

public class CustomerException {
	public static void main(String[] args) {
		MyException object=new MyException("Sachin");
		object.toString();
		try {
			System.out.println("Starting of try block");
			//I'm throwing the custom exception using throw
			throw new MyException("This is my error Message");
			
		}catch(MyException e) {
			System.out.println("Catch Block");
			System.out.println(e);
			
		}
	}

}
