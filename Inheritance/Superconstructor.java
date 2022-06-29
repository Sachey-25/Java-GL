package Inheritance;

class Superconstructorclass {
	
	//constructor
	Superconstructorclass(){
		System.out.println("Constructor of parent class");
	}
	
}
class Subsuperclass extends Superconstructorclass{
	
	//sub class constructor
	Subsuperclass(){
		super();
		System.out.println("Constructor of subclass");
	}
}

public class Superconstructor {

	public static void main(String[] args) {
		Subsuperclass object=new Subsuperclass();
	}

}
