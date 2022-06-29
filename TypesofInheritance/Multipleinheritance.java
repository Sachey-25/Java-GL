package TypesofInheritance;

/* "Multiple inheritance" refers to the concept of one class extending more than
two base class. The multiple inheritance is that have to manage the dependence on two
base classes.
*/

interface Firstparentclass{
	
	//Method inside first parent class
	public void fun();
	
}
interface Secondparentclass{
	//Method inside second parent class
	public void fun();
	
}

interface MultisubInheritance extends Firstparentclass{
	public void show();
	
}

public class Multipleinheritance {

	public static void main(String[] args) {
		

	}
}
