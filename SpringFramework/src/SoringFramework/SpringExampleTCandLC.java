package SoringFramework;

public class SpringExampleTCandLC {
	public void display(){
		System.out.println("Helo World");
		}
	public void displayOne(){
			System.out.println("Helo World");
	}
	public void displayTwo(){
			System.out.println("Helo World");
	}
	 public void displayThree(){
			System.out.println("Helo World");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tightly coupled -- an any object is represented to 
//		call the class using new operator then it tightly coupled.
		
		SpringExampleTCandLC object = new SpringExampleTCandLC();
		object.display(); // output
	}
}