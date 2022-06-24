package Inheritance;
//Parent class
public class JavaInheritance {
	int empid;
	String empname;
	String empcity;
	String empstate;
	public JavaInheritance(int empid, String empname, String empcity, String empstate) {
		this.empid = empid;
		this.empname = empname;
		this.empcity = empcity;
		this.empstate = empstate;
	}
	public static void main(String[] args) {
		
		SubClass object = new SubClass(101, "Sachin", "Bangalore", "Karnataka");
		System.out.println(object.empid);
		System.out.println(object.empname);
		System.out.println(object.empcity);
		System.out.println(object.empstate);
	}
}
//SubClass
class SubClass extends JavaInheritance {

	public SubClass(int empid, String empname, String empcity, String empstate) {
		super(empid, empname, empcity, empstate);
	}
}
