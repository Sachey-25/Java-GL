package org.globallogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTest {	
	//Wrapper object
	MathUtils mathUtils;	
	//Initialize the object for the class
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("This needs to need to be run before all the methods");
	}
	
	@BeforeEach
	public void init() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	public void cleanup() {
		System.out.println("Cleaning up...");
	}
	
	@Test
	public void test() {
		int expected=10;
		int actual=mathUtils.add(5,2);
		assertEquals(expected,actual);
	}
	@Test
	public void testdevide() {	
		assertThrows(ArithmeticException.class, ()-> mathUtils.devide(10, 0));
	}
}