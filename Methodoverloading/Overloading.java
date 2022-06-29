package Methodoverloading;
// Overloading - Different Number of parameters in argument list

class DisplayOverloading{
	
	//Method
	public void disp(char ch) {
		System.out.println(ch);
	}

	//Overloading - with the difference in data type of parameters
	public void disp(int num) {
		System.out.println(num);
	}
	public void disp(float num) {
		System.out.println(num);
	}
	public void disp(String name) {
		System.out.println(name);
	}
	
	//Overloading - with Sequence of data type of parameters.
	public void disp(String name, float integer) {
		System.out.println(name + "," + integer);
	}

	public void disp(char ch, int number) {
		System.out.println(ch + "," + number);
	}
}

public class Overloading {

	public static void main(String[] args) {
		DisplayOverloading object=new DisplayOverloading();
		object.disp('A');
		object.disp('B', 10);		
		object.disp(100);
		object.disp("Sachin",3.14f);
	}
}