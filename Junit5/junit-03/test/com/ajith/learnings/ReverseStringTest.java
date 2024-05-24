package com.ajith.learnings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest { 

	@Test
	void test() {
		//fail("Not yet implemented");
	ReverseString rs= new ReverseString();
	assertEquals("avaJ",rs.reverseString("Java"));
	assertEquals("htija",rs.reverseString("ajith"));
	}

}
