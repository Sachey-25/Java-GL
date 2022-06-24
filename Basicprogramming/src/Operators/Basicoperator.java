package Operators;

public class Basicoperator {

	public static void main(String[] args) {
		//1. arithmetic operator
		// + : addition, - : subtraction * : multiplication /:division 
		// % : modulous, // : floor division , **: exponential
		int numberone=10;
		int numbertwo=20;
		System.out.println("additing 10 and 20 is : " +(numberone+numbertwo));
		System.out.println("substraction 10 in 20 is : " + (numberone-numbertwo));
		System.out.println("mulitplication of 10 and 20 is : " + numberone*numbertwo);
		System.out.println("dividing 10 by 20 is : " + numberone/numbertwo);
		System.out.println("Mod of 10 and 20 : " + numberone%numbertwo);
		
		//2. Assignment operators 
		// the symbol '=' assigns the RHS values to LHS
		int valueone=30;
		int valuetwo=40;
		valueone=valuetwo;
		System.out.println("= Output: " + valueone);
		System.out.println("= Output: " + valuetwo);
		valueone+=valuetwo;
		System.out.println("= Output: " + valueone);
		System.out.println("= Output: " + valuetwo);
		valueone-=valuetwo;
		System.out.println("= Output: " + valueone);
		System.out.println("= Output: " + valuetwo);
		valueone*=valuetwo;
		System.out.println("= Output: " + valueone);
		System.out.println("= Output: " + valuetwo);
		valueone/=valuetwo;
		System.out.println("= Output: " + valueone);
		System.out.println("= Output: " + valuetwo);
		valueone%=valuetwo;
		System.out.println("= Output: " + valueone);
		System.out.println("= Output: " + valuetwo);
		
		
		// 3. increment and decrement operator
		// ++ , -- 
		// post and pre increment , post and pre decrement 
		int digit=112;
		
		digit++; // post
		System.out.println(digit); // 112 
		// Post thought the interpreter increases the value but it just stores unless
		// executing -- 112 // but when we call the same digit by then the value will be
		// 113
		++digit; // pre // it will increases and executes and then stores in memory.
		System.out.println(digit); // 114		
	}
}