// Obejct oriented programming --- class and object , methods 

public class Localvariable {
	//instance variable
	//Dynamic object allocation --- User defined.
	public void myMethod() {
		//local variable
		String name="My name is Sachin";
		System.out.println(name);
	}
	public void example() {
		//local variable
		String java="My name is Java";
		System.out.println(java);
	}
	public void anthexample() {
		//local variable
		String code="My name is Programming";
		System.out.println(code);
	}
	public void anthrMethod() {
		//local variable
		String name="My name is Sachin";
		System.out.println(name);
	}
	public void anthroexample() {
		//local variable
		String java="My name is Java";
		System.out.println(java);
	}
	public void anotherexample() {
		//local variable
		String code="My name is Programming";
		System.out.println(code);
	}

	public static void main(String[] args) {
		//Entire program gets executed.
		
		// create an object
		// classname <objectname> = new classname()
		Localvariable object = new Localvariable();
		object.myMethod(); //function call
		object.anotherexample();
		object.anthexample();
		object.example();
		object.anthrMethod();
		object.anthroexample();
	}
}