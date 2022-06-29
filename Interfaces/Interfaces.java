package Interfaces;

interface Myinterface{
	
	public void displayinfo(int number);
	public void displayinfoOne(String name);
	public void displayinfoTwo(float num);
	public void displayinfoThree(char ch);
	public void displayinfoFour(double dou);
	public void displayinfoFive(long age);
	
}

class Demo implements Myinterface{

	@Override
	public void displayinfo(int number) {
		if(number%2==0) {
			System.out.println(number+ ": It is even");
		}else {
			System.out.println(number + ": it is odd");
		}	
	}
	
	@Override
	public void displayinfoOne(String name) {
		System.out.println("My name is : " + name);	
	}

	@Override
	public void displayinfoTwo(float num) {
		if(num/3==0) {
			System.out.println(num + "Digit is in decimal value");
		}else if(num/3!=0) {
			System.out.println(num + "Digit is in decimal value");
		}
	}

	@Override
	public void displayinfoThree(char ch) {
		if(ch=='Q') {
			System.out.println(ch + ": known that is the most beautiful letter");
		}		
	}

	@Override
	public void displayinfoFour(double dou) {
		System.out.println(dou + ": Decimal numbers are double by default");
	}

	@Override
	public void displayinfoFive(long age) {
		if(age>=18) {
			System.out.println("Eligible age for voting");
		}else {
			System.out.println("You are not eligible since age policy");
		}		
	}
}

public class Interfaces {

	public static void main(String[] args) {
		Myinterface object=new Demo();
		
		object.displayinfo(10);
		object.displayinfoOne("Sachin");
		object.displayinfoTwo(42f);
		object.displayinfoThree('Q');
		object.displayinfoFour(3.142);
		object.displayinfoFive(28);
	}
}