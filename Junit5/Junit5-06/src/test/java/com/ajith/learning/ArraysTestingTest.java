package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;



class ArraysTestingTest {

	@Test
	void test() {
		int absolute[]= {1,2,2,3,3};
		int expected[]= {1,2,3,3,2};
		Arrays.sort(expected);
		assertArrayEquals(expected,absolute);
//		assertEquals(expected,absolute);// because it checking the reference variable it does not check with data 
	}
// i deleted the supplier functional interface method
	
}
