package org.springcore.autowire.annotation;

public class AnotherExample {
	private String fname;
	private String laname;
	private int age;
	
	public AnotherExample() {
		super();
	}
	public AnotherExample(String fname, String laname, int age) {
		super();
		this.fname = fname;
		this.laname = laname;
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLaname() {
		return laname;
	}
	public void setLaname(String laname) {
		this.laname = laname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AnotherExample [fname=" + fname + ", laname=" + laname + ", age=" + age + "]";
	}
	
	

}
