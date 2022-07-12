package JavaDatastructures_Stack;

import java.util.Stack;

public class JavaDatastructuresStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(13);
		stack.push(56);
		stack.push(62);
		stack.push(90);
		stack.push(89);
		
		System.out.println("Total size of the Stack : " + stack.size());
		System.out.println("Elements of the stack " + stack);
		
		for(int i=0; i<stack.size();i++) {
			System.out.println(stack);
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());		
	}
}