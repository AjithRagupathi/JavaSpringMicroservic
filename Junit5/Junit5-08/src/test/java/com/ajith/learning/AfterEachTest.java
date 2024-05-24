package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AfterEachTest {
	
	@BeforeAll
	static void beforeall(){
		System.out.println("Beforeall method executed first");
	}
	@AfterAll    
	static void afterAll() {
		System.out.println("After all method is executed");
	}
	Shapes sh;
	@BeforeEach
	void init(){
		sh= new Shapes();
		System.out.println("Before each method is executed");
	}
	@Test
	void testComputeAreaRectangle() {
		assertEquals(200,sh.computeRectangleArea(10, 20));
		System.out.println("Actual test case");
		
	}
	@Test
	void testComputeAreaSquare() {
		assertEquals(100,sh.computeSquareArea(10));
		System.out.println("Actual test case");
		//assertEquals(1f0,sh.computeSquareArea(10));
	}
	@AfterEach
	void destroy() {
		System.out.println("After each method is executed");
	}


}
