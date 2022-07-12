package UnitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTestingimpl {
	
	//Method
	@Test
	public void add_twoplustwo_returnfour() {
		final int expected=10;
		final int actual=Math.addExact(8,2);
		//Test method to perform unit testing
		assertEquals(actual,expected);
	}
	@Test
	public void multiply() {
		final int result=10;
		int test = Math.multiplyExact(5,2);
		assertEquals(result,test);
		//return test;
	}

	public static void main(String[] args) {
		System.out.println("Single unit implement and tested");
		System.out.println("Testing went good");	
	}
}
