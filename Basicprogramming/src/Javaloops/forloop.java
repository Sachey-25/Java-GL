package Javaloops;

public class forloop {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// keyword for
		for(int number=10;number==10;number++) {
			System.out.println("for loop executed for once");
			// given number value is 10
			// condition number = number ? 10=10 yes || iteration || once
			// increment == post increment || 10++ || 11
			// condition number = number ? 11 = 10 No
			System.out.println(number);
		}
		System.out.println("====================================");
		for(int number=1; number<=10; number++) {
			System.out.println("For loop executing untill it equals to 10.");
			System.out.println(number);
		}
		System.out.println("---------------------------------------");
		for(int integer=10; integer%2==0; integer++) {
			System.out.println(integer+ ": Is even");
		}
		
		for(int digit=1; digit<=10; digit++) {
			if(digit%2==0) {
				System.out.println(digit + ": Is even");
			}else
				System.out.println(digit + ": is odd");
		}
		//Nested loops === Loop within the loop
		for(int i=1; i<=3; i++) {
			//loop body
			System.out.println("I has been initialized");
			System.out.println(i);
			for(int j=1; j<=3;j++) {
				System.out.println("J is nested within the loop.");
				System.out.println(j);
				System.out.println(i + " : " + j);
			}
		}
		/*
		 * *
		 * * *
		 * * * * 
		 * * * * */
		for(int k=1; k<=5; k++) {
			for(int l=1; l<=k; l++ ) {
				System.out.print("*");	
			}
			System.out.println();		
		}
		System.out.println("----------------------------------");
		int iter=5;
		for(int k=1; k<=iter; k++) {
			for(int l=iter; l>=k; l-- ) {
				System.out.print("*");	
			}
			System.out.println();		
		}
		System.out.println("----------------------------------");
		for(int k=1; k<=5; k++) {
			for(int l=1; l<=k; l++ ) {
				System.out.print("*");	
			}
			System.out.println();		
		}
		int iterr=5;
		for(int k=1; k<=iterr; k++) {
			for(int l=iterr; l>=k; l-- ) {
				System.out.print("*");	
			}
			System.out.println();		
		}
	}
}