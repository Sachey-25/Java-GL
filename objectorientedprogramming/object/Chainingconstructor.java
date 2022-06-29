package objectorientedprogramming.object;

public class Chainingconstructor {
	
	//Parent class
	Chainingconstructor(){
		System.out.println("Main class constructor");
		
	}
	public static void main(String[] args) {
			new SubClass();
			}
	}
// SubClass
	class SubClass extends Chainingconstructor{
		SubClass(){
			System.out.println("Subclass Constructor");
			
		}
}