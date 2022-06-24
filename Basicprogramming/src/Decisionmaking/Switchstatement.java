package Decisionmaking;

public class Switchstatement {

	public static void main(String[] args) {
		//Switch statement is used when we have number of options and we may 
		// need to perform a different task for each other. 
		
		/*Syntax:
		/ switch(){
		 * case <variable/constant>:
		 * Java Code 
		 * **
		 * **
		 * **
		 * 
		 * 
		 * 
		 * case n:
		 * **
		 * **
		 * default:
		 * **
		 * **
		} */
		
		int number=2;
		switch(number=number+1) {
		case 1:
			System.out.println("case 1 : Value is :"+ number);
		case 2:
			System.out.println("case 2: Value is : " + number);
		case 3:
			System.out.println("case 3: Value is : " + number);
		case 4:
			System.out.println("case 4: Value is: " + number);
		default:
			System.out.println("Default : Value is :" + number);
		}
		System.out.println("==--==--==--==--==--==--==--==--==");
		int i=2;
		switch(i) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;		
		}
	}
}