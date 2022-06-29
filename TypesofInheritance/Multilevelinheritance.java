package TypesofInheritance;

class Firstprntclass{
	public void methodA(){
		System.out.println("Method from Class A ");
	}
}
class Firstsubclass extends Firstprntclass{
	public void methodB(){
		System.out.println("Method from Class B ");
	}
	
}
class Secondsubclass extends Firstsubclass{
	public void methodC(){
		System.out.println("Method from Class C ");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		Secondsubclass object=new Secondsubclass();
		object.methodA();
		object.methodB();
		object.methodC();
	}
}