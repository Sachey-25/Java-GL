package ExceptionHandlingIntro;

public class ExceptionHandlingAnotherexmple {

	//method
	static void myMethod() {
		try {
				int num=10/0;
				System.out.println(num);// Interrupted
			try {
				int number=100/0;
				System.out.println(number);
				
			}catch(Exception e) {
				System.out.println("Excetion hanled but our eyes are on finally..");		
			}
			finally {
				System.out.println("Nested Finally Block");
			}
		}
		finally	{
			System.out.println("This is Finally block");
				System.out.println("Finally block ran even after return statement");
			}
	}
	public static void main(String[] args) {
		// Another example of finally block and return statement
		try {
			int array[]=new int[5];
			array[5]=30/2;
			array[4]=8/0;
		}
		catch(Exception e) {
			System.out.println("Found an exception and its been handled");
		}
		finally {
			System.out.println("I am executing from Finally block");
		}
		myMethod();
	}
}