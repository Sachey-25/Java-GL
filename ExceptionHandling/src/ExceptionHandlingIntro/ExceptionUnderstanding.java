package ExceptionHandlingIntro;

public class ExceptionUnderstanding {

	public static void main(String[] args) {
		
		int numone;
		
		try {
			/* We suspect that this block of code can throw 
			 * exceptions so we handled it by placing these statements
			 * inside the try and handled the exception in catch block
			 * 
			 */
			numone=10;
			// arithmetic exception    10/0;
			int devide=numone/0;
			System.out.println(devide);
			System.out.println("Hey! I am at try block");
		}
		catch (NullPointerException e) {
			System.out.println("Null pointer exception caused");
			System.out.println("Exception Handled");
		}
		catch (ArithmeticException e){
			System.out.println("You should not devide a number by Zero");
			System.out.println("Exception Handled");
			System.out.println("Just Test");		
		}
		catch (Exception e){
			System.out.println("Number is being devided by zero");
			System.out.println("Exceotion Handled");
		}		
	}
}