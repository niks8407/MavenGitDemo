package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c = new Calculator();
	@Disabled
    @Test  //must be written to run as test case
	public void testSayHello() {
		//Assertions.assertEquals(expected,actual)
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	@Disabled //won't run this testcase
    @Test
    public void testAddTwoNos() {
    	int result = c.addNos(100, 200);
    	Assertions.assertEquals(300,result);
    }
	@Disabled
    @Test 
    public void testsubsTwoNos() {
    	int result = c.subsNos(300, 100);
    	Assertions.assertEquals(100,result,"please check substraction method code ");
    	//message is optional,if test case failed message will displayed
    }
	@Disabled
    @Test
    public void testAssertNulls() {
    	String s1 = null;
    	String s2 = "Nikhil";
        Assertions.assertNull(s2);	
        Assertions.assertNotNull(s2);
    }
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller");
		Assertions.assertNotEquals("Hello","hello");
	}
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		
		Assertions.assertEquals(2, myList.size());
	}
}
