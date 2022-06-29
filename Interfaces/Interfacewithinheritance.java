package Interfaces;

	//Parent class 1
		interface Baseclass{			
			abstract void printsomething();
		}
		interface Baseclasstwo{
			abstract void printsomething();			
		}
		interface Baseclassthree{
			abstract void printsomething();
		}
		interface Baseclassfour{
			abstract void printsomething();
		}
		interface Baseclassfive{
			abstract void printsomething();
		}

//interface Subclass extends Baseclass{
//	
//}
//interface subclasstwo extends Baseclasstwo{
//	
//}
//interface subclassthree extends Baseclassthree{
//	
//}
//interface subclassfour extends Baseclassfour{
//	
//}
class Demonstration implements Baseclass,Baseclasstwo,Baseclassthree,Baseclassfive{

	@Override
	public void printsomething() {
		System.out.println("Multiple inheritance accomplished");
	}
}
public class Interfacewithinheritance {

	public static void main(String[] args) {
		Demonstration object=new Demonstration();
		object.printsomething();	
	}
}