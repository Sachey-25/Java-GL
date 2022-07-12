package ExceptionHandlingIntro;

public class NestedExceptionExample {
		
	public static void main(String[] args) {
		//parent = child play 
		try {
			//child try block
			try {
				int b=45/2;
					System.out.println(b);
				}
			catch(Exception e) {
					
			}
				try {
					int a=23/0;
					System.out.println(a);
					
				}catch(Exception e) {
					System.out.println("Arithmatic Exception occurred");
				}
						
				try {
					System.out.println("Nested Try block is implemented.");		
					}
				catch(Exception e) {
				}
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("We need to have the try block all time +"
					+ " in terms of implementation");
		}
	}
}