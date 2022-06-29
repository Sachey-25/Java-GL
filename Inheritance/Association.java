package Inheritance;
//Association establishes relationship between two separate classes through their
// object. Two separate classes through their objects.
// The relationship can be one to one, One to many and many to one and many to many.

class Car{

	String carname;
	int carid;
	int carmodel;
	String brand;
	int mfgyear;
	
	//constructor car class
	public Car(String name, int id, int model, String brand, int year) {
		this.carname=name;
		this.carid=id;
		this.carmodel=model;
		this.brand=brand;
		this.mfgyear=year;
		
	}
}
class Buyer extends Car{
	String customerName;
	
	Buyer(String name,String carname, int carid,int carmodel,String brand,int mfgyear){
		super(carname,carid,carmodel,brand,mfgyear);
		
		this.customerName=name;
		
	}
}

public class Association {

	public static void main(String[] args) {
		Buyer object=new Buyer("Sachin Anil", "Creta", 1234, 2022, "Hyundai", 2022);
		System.out.println(object.carname);
		System.out.println(object.customerName);
		System.out.println(object.brand);

	}
}