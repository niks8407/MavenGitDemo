package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c = new Calculator();
	int sum = 0;
	
	@BeforeAll //the method should always be static because globally accessing
	//will run only once
	public static void testStartDbConn() {
		System.out.println("DB connection is up - only once");
	}
	
	@BeforeEach //can't be disabled
	//executed before each test cases
	public void testStartup() {
		sum = 0;
		System.out.println("sum is zero" + sum);
	}
	
    @Test
    public void testAddTwoNos() {
    	System.out.println("test case 1");
    	int result = c.addNos(100, 200);
    	Assertions.assertEquals(300,result);
    }
    @Test 
    public void testsubsTwoNos() {
    	System.out.println("test case 2");
    	int result = c.subsNos(300, 100);
    	Assertions.assertEquals(100,result,"please check substraction method code ");
    	//message is optional,if test case failed message will displayed
    }
    
    @AfterEach
    public void testShutDown() {
    	System.out.println("some object null");
    }
    
    @AfterAll
    public static void testCloseDbConn() {
    	System.out.println("DB connection is close");
    }

}
