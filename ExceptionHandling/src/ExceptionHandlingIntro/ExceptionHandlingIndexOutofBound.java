package ExceptionHandlingIntro;

public class ExceptionHandlingIndexOutofBound {

	public static void main(String[] args) {
		//Exception Handling implementation
		try {
			int array[]=new int[7];
			array[0]=1;
			array[1]=2;
			array[2]=3;
			array[3]=4;
			array[4]=5;
			array[5]=6;
			array[6]=5;
			array[7]=45/0;
			array[8]=100;
			
			//Write a java code to check the number is even or odd
			// integer -- odd or odd 
			// String  -- entered the string instead integer 
			// while loop 
			// dynamically !!!!!
			for(int i=0;i<array.length;i++)
			System.out.print(","+array[i]);
			System.out.println();
			
		}		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("Arithmatic exception is handled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We are trying to push the index at 8");
			System.out.println("Since the array has max length 7");
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Insersion is not possible, since array fixed length type");
			System.out.println("Exception handled.");
		}
		catch(Exception e) {
			System.out.println("We are trying to push the index at 8");
			System.out.println("Since the array has max length 7");
			System.out.println("Insersion is not possible, since array fixed length type");
			System.out.println("Exception handled.");
		}
		finally {
			System.out.println("Finally Block");
			System.out.println("My name is Finally, AND HI TO POU FOLKS!!!!!!");
		}
	}
}