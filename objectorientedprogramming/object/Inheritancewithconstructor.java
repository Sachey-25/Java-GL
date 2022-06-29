package objectorientedprogramming.object;
//Child class
class Studentinfo extends Inheritancewithconstructor{

	Studentinfo(int rollno, String name, String city, String state) {
		super(rollno, name, city, state);
	}
}		
//Parent class
public class Inheritancewithconstructor {
	//class data members
	int sturollno;
	String stuname;
	String city;
	String state;
	
	//Parent class - constructor and the data meters
	Inheritancewithconstructor(int rollno,String name, String city, String state){
		this.sturollno=rollno;
		this.stuname=name;
		this.city=city;
		this.state=state;		
	}
	
	public int getSturollno() {
		return sturollno;
	}

	public void setSturollno(int sturollno) {
		this.sturollno = sturollno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public static void main(String[] args) {
		//Creating an object to the subclass and passing values
		Studentinfo stuobj=new Studentinfo(101,"Sachin","Bangalore", "Karnataka");
		//Addressing the object with the reference data sturollno
		System.out.println(stuobj.sturollno);
		//Addressing the object with the reference stuname
		System.out.println(stuobj.stuname);

	}
}