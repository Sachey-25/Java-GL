package Javamethods;

public class Methodreuse {
	
	public static int getSqaure(int x) {
		return x * x;
	}
	public int getSq(int y) {
		return y * y;
	}
	public void getSqa(int z) {
		System.out.println(z*z);

	}

	public static void main(String[] args) {
		for(int i=1; i<=6 ; i++) {
			int result=getSqaure(i);
			System.out.println("Sqaure of " + i + " is = " + result);
		}
		Methodreuse obj=new Methodreuse();
		obj.getSq(4);
		obj.getSqa(8);
	}
}