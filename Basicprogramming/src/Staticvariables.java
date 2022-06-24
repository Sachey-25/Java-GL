
public class Staticvariables {
	
	public static String myClass="Class or static variable";

	public static void main(String[] args) {
		
		Staticvariables object = new Staticvariables();
		Staticvariables objectone = new Staticvariables();
		Staticvariables objecttwo = new Staticvariables();	
		System.out.println(object.myClass);
		System.out.println(objectone.myClass);
		System.out.println(objecttwo.myClass);
	}
}