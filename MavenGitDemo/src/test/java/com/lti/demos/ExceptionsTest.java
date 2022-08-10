package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {Integer.parseInt("one");});
		
		//Integer.parseInt("One");
	}	
	 //how to do it without anonymous
    @Test
    public void testmethodExp() {
    	Calculator c = new Calculator();
    	final Exception e = assertThrows(ArithmeticException.class,
    			() -> {c.searchEmp(0);});
    	Assertions.assertEquals("You entered zero", e.getMessage());
    }
		

}
