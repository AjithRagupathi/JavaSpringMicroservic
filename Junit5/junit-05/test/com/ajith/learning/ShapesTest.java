package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes s= new Shapes();
	@Test
	void testComputeAreaOfSquare() {
		//fail("Not yet implemented");
		
		double expected =576;
		assertEquals(expected,s.ComputeAreaOfSquare(24));
	}
	@Test
	void testComputeAreaOfCircle() {
		assertEquals(78.5,s.computeAreaOfCircle(5));
	}

}
