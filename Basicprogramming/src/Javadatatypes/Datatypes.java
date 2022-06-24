package Javadatatypes;

public class Datatypes {

	public static void main(String[] args) {
		byte num;
		num=113; // -128 --0--- 127 bits
		System.out.println(num);// output : 113
		
		short numb;
		numb=4567; // -32768 to 32767 || 2bytes
		System.out.println(numb);
		
		long numbe;
		numbe=12332252626L; // 8bytes = 8*8 = 64bits 
		System.out.println(numbe);
		
		double number;
		number=-42937737.9; //8bytes
		System.out.println(number);
		
		float numberdeci;
		numberdeci=-42937737.98799f; // 4bytes
		System.out.println(numberdeci);
		
		boolean b=false; // either true or false 
		System.out.println(b);		
		
		char ch='Z'; // 2bytes || 8*2 = 16bites || 2blocks
		System.out.println(ch);
		
		int has=10000; // 4bytes || 4*8 = 32bit || 4blocks		
		System.out.println(has);
	}
}