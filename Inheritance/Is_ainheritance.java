package Inheritance;

class Student{
	String name = "Sachin Anil";
}

class Teacher{
	String designation="Principle";
	String collegeName="Reva ITM";
	
	//non-static class method
	void does() {
		System.out.println("Teaching");
	}
}
public class Is_ainheritance extends Teacher{
	//variable
	String mainsubject="physics";
	//Most recent variable change
	String designation="Teacher";

	public static void main(String[] args) {
		//Creating an object to Subclass
		Is_ainheritance instance=new Is_ainheritance();
		
		Student onject = new Student();
		System.out.println(onject.name);
		
		System.out.println(instance.designation);
		System.out.println(instance.collegeName);
		System.out.println(instance.mainsubject);
		// is-a relationship - We can say that physicsTeachers IS-A Teacher.
	}
}