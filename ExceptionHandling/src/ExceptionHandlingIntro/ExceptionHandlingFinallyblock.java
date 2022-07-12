package ExceptionHandlingIntro;

public class ExceptionHandlingFinallyblock {

	public static void main(String[] args) {
		/*
		 * try{
		 *		statement of try block
		 *}
		 *catch{
		 *		statement of catch block
		 *}
		 *finally{
		 *		statement of finally block
		 *}
		 */
		try {
			int num=122/5;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("Number should not be devided by zero");
		}
		/*Finally block always executes
		 * Even if there no exception in try block
		 */
		finally {
			
		//	System.out.println(number);
			System.out.println("This is finally block");
		}
		System.out.println("Out of the try-catch-finally");
	}
}