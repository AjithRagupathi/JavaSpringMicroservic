package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeEach {
	Shapes sh;
	@BeforeEach
	void init(){
		sh= new Shapes();
		System.out.println("Before each executed");
	}
	@Test
	void testComputeAreaRectangle() {
		assertEquals(200,sh.computeRectangleArea(10, 20));System.out.println("rectangle");
		
	}
	@Test
	void testComputeAreaSquare() {
		assertEquals(100,sh.computeSquareArea(10));System.out.println("square");
		assertEquals(100,sh.computeSquareArea(10));System.out.println("square");
	}

}
