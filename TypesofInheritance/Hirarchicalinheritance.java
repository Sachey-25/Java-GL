package TypesofInheritance;

class Mainclass{
	//Method
	public void methodMc() {
		System.out.println("method of main class");
	}
}
class SubclassB extends Mainclass{
	//Method
	public void SubB() {
		System.out.println("method of main class SubclassB");
		}
}
class SubclassC extends Mainclass{
	//Method
	public void SubC() {
		System.out.println("method of main class SubclassC");
	}
}
class SubclassD extends Mainclass{
	//Method
	public void SubD() {
		System.out.println("method of main class SubclassD");
	}
}
class SubclassE extends Mainclass{
	//Method
	public void SubE() {
		System.out.println("method of main class SubclassE");
	}
}

public class Hirarchicalinheritance {

	public static void main(String[] args) {
		SubclassB ob=new SubclassB();
		SubclassC obj=new SubclassC();
		SubclassD obje=new SubclassD();
		SubclassE objec=new SubclassE();
		
		ob.methodMc();
		obj.methodMc();
		obje.methodMc();
		objec.methodMc();
		
	}
}