package Operators;

public class Decisionmakingoperator {

	public static void main(String[] args) {
		//Logical Operator 
		// Logical AND logical OR logical NOT
		// &&       ||          !
		// return type is always a boolean 
		boolean var=true;
		boolean let=false;
		System.out.println("-------Logical AND operator-----------------------");
		// Logical AND operator returns the result true if both the operands are true
		System.out.println("Operand one is true and another is false, Hence: "+(var&&let));
		boolean vari=false;
		boolean letone=true;
		System.out.println("Operand one is false and another is true, Hence: "+(vari&&letone));
		boolean varib=false;
		boolean lettwo=false;
		System.out.println("Operand one is false and another is false, Hence: "+(varib&&lettwo));
		boolean varibl=true;
		boolean letthree=true;
		System.out.println("Operand one is true and another is true, Hence: "+(varibl&&letthree));
		
		System.out.println("---------------Logical OR operator-------------------");
		
		boolean check = true;
		boolean test=false;
		System.out.println("Operand one is true and another is false, Hence: "+
		(check||test));
		
		boolean checkone=false;
		boolean testone=true;
		System.out.println("Operand one is false and another is true, Hence: "+
		(checkone||testone));
		
		boolean checktwo=false;
		boolean testtwo=false;
		System.out.println("Operand one is false and another is false, Hence: "+
		(checktwo||testtwo));
		
		boolean checkthree=true;
		boolean testthree=true;
		System.out.println("Operand one is true and another is true, Hence: "+
		(checkthree||testthree));
		//Note !: not operand is simply a reverse of condition
		// if its true ---- !true === false 
		// if its false --- !false === true
	
		// Comparison operator
		/* == equals to 
		 *	!= Not equals to ,
		 *	> ==> Greater
		 *	< ==> lesser, 
		 *	>= ==> Greater than equal to 
		 *	<= ==> lesser than equals to || if statement. */
		
		//Ternary Operator
		// which can be replaced with if statement
		// Syntax :
		// variable = expression ? condition1 : condition2
		
		int numberone=45 , numbertwo;
		numbertwo = (numberone==25)? 25:1234567890;
		System.out.println(numbertwo);
						
	}
}