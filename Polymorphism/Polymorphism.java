package Polymorphism;

class Person {
	// Regular method
	public void sound() {

	}
	public void nameList() {

	}
	public void age() {

	}
	public void city() {

	}
	public void state() {

	}
	public void pin() {
		
	}
}
class Name extends Person{
	@Override
	public void nameList() {
		System.out.println("My name is Sachin");
		System.out.println("My name is ABC");
		System.out.println("My name is EDF");
		System.out.println("My name is GHI");
		System.out.println("My name is JKL");
		System.out.println("My name is MNO");
		System.out.println("My name is PQR");
	}
	
}
class Age extends Person{
	@Override
	public void age() {
		System.out.println("and I am 28 years old");
	}
	
}
class City extends Person{
	@Override
	public void city() {
		System.out.println("I belong to Bidar ");
	}
	
}
class State extends Person{
	@Override
	public void state() {
		System.out.println("From Karnataka");
	}
	
}
class Pin extends Person{
	@Override
	public void pin() {
		System.out.println("I reside @585414");
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("The names of people present in person class");
		Person nameList=new Name();
		nameList.nameList();
		Person age=new Age();
		age.age();
	}
}