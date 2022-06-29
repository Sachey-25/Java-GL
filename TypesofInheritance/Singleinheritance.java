package TypesofInheritance;

class Parentclass{
	
	//Method
	public void methodParent() {
		System.out.println("Base class Method");
	}
}
//Inheritance -- single object inheritance 

class Childclass extends Parentclass{
	
	//subclass method
	public void methodsubclass() {
		System.out.println("Derived class Method");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		Childclass object=new Childclass();
		object.methodParent();
		object.methodsubclass();
	}

}
