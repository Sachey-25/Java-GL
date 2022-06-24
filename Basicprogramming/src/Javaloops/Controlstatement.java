package Javaloops;

public class Controlstatement {

	public static void main(String[] args) {
		// continue and break; -- Jumping statement
		
		/* When a break statement is encountered inside a loop, the loop
		 * immediately terminated and the program control resumes that at
		 * the next statement following the loop
		 * 
		 * The java break statement is used to break loop or switch statement
		 * it breaks the current flow of the program at specified condition.
		 * in case of inner loop, it break only inner loop.
		jump statement
		break;
		*/
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break; // for loop will terminate the moment when condition true;
			}
			System.out.println(i);
		}
		//Outer loop
		for(int j=1;j<=5;j++) {
			//inner loop
			for(int k=1;k<=5;k++) {
				if(j==2 && k==2) {
					break;
				}
				System.out.println(j+" " +k);
			}
		} // 3 4 and 5
		
		System.out.println("-------------------------");
		/* The continue statement is used in loop control statement when you 
		 * need to jump to the next iteration of the loop immediately, it can be
		 * used with for or while loop.
		 * 
		 * jump-statement
		 * continue;
		 */
		for(int h=1;h<=10;h++) {
			if(h==5) {
				continue; // skip the iteration 5 
			}
			System.out.println(h);
		}
	}
}
