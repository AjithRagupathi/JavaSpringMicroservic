package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString reverse= new ReverseString();//here i placed the instance so both method can use of this objectreference
	
	@Test
	void testReverseString_oneword() {// the method name was changed
		//ReverseString reverse= new ReverseString();
	assertEquals("ajith",reverse.reverseStrings("htija"));
	}
	@Test // the annotation is must then only the platform engine will consider as a test case

	void testReverseString_MultipleWords() {// the method name was changed
	
		//ReverseString reverse= new ReverseString();
		
		assertEquals("ajith is my name",reverse.reverseStrings("eman ym si htija"));
	
	}
}
