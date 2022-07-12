package Java8programming;



//Method
//<access specifier><return type> functionName(){
//	
//}
//lambda functional implementation
// we must know that LE doesn't have 1. Function name 2. return type 
// but LE has 1. body 2. parameter list

// Why do we need LE
/* 1. To provide the implementation of functional interface
 * ---> an interface which has only one abstract method is  called 
 * functional interface, Java provides an annotation @FunctionalInterface
 * used to declare an interface as functional interface.
 * 2. Less Coding
*/

//Syntax:
/*
 * () ->{
 *		// Body of no parameter lambda
 * }
 * (p1)->{
 * 		// Body of single parameter lambda
 * }
 * (p1,p2)->{
 * 		// Body of two parameter lambda
 * }
 * (p1,p2,p3,p4,p5......)->{
 * 		// Body of two parameter lambda
 * }
 */

//interface
interface Addition{
	//abstract method
	public void numbers();
}
public class Java8Lambaexpression {
	public static void main(String[] args) {
		//without lambda, addition implementation using anonymous function
		Addition object=new Addition() {
		
			public void numbers() {
				System.out.println("Additon operation to be perfomed.");
			}
		};
		object.numbers();
				
		//Lambda implementation
		Addition obj= () -> {
			System.out.println("Addition operation to be perfomed");
		};
		obj.numbers();
	}
}