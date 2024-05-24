package com.ajith.javaspringmicroseviceslearning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cl=new Calculator();
		//assertEquals(5,cl.divide(100, 20));
		int actualValue=cl.divide(10, 3);
		int expectedResult=3;
		assertEquals(actualValue,expectedResult);
		          
	}

}
