package Decisionmaking;
import java.util.*;

public class ifstatement {

	public static void main(String[] args) {
		int number=10;
		int num=201;
		
		if(true) {
			System.out.println(number + ": is even ");
		}
		if(true) {
			System.out.println(number + ": is odd");
		}
		System.out.println("I made all the if statement true.");
		
		if(number%2==0) {
			System.out.println(number + ": is even ");
		}
		// if .. else 
		System.out.println("----------------------------------------");
		if(num%2==0) {
			System.out.println(num + ": Number is even");
			System.out.println("This is If block");
		}else {
			System.out.println(num + ": Number is odd" );
			System.out.println("This is else block");
		}
		
		// What else if I wanted to check multiple conditions
		// three numbers compare them  3! = 3*2*1 = 6
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		int numberone=100, numbertwo=101, numberthree=102;
		if(numberone == numbertwo) {
			System.out.println("Numberone == numbertwo");
			System.out.println("This is my first if block");
			
		}else if(numbertwo == numberthree) {
			System.out.println("Numbertwo == numberthree");
			System.out.println("This is my second if block");
			
		}else if(numberthree == numberone) {
			System.out.println("Numberthree == numberone");
			System.out.println("This is my third if block");
			
		}else if(numberone<numbertwo) {
			System.out.println("Numberone < numbertwo");
			System.out.println("This is my fourth if block");
		}
		else if(numbertwo<numberthree) {
			System.out.println("Numbertwo < numberthree");
			System.out.println("This is my fifth if block");
		}
		else {
			System.out.println("else block : None of the  if block are true. ");
		}
		
		//if nested
		if(true) {
			System.out.println("First if statement");
			if(true) {
				System.out.println("Second if statement");
				if(true) {
					System.out.println("Third if statement");
					if(true) {
						System.out.println("Fourth if statement");
					}
				}
			}
		}		
			
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int digit = input.nextInt();
		
		System.out.println("Enter you name: ");
		String name = input.next();
		System.out.println(name);
		
		if(digit%2==0) {
			System.out.println(digit + ": It is a even number");
			}
		else if(digit%2==1) {
			System.out.println(digit + ": it is a odd number");
		}
		input.close();		
	}
}