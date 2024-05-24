package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {
	SortingArray sortarr = new SortingArray();

	@Test
	void testSortingArray_Exception() {
//		int unsortedarr[]= {3,4,1,2};
//		try {
//		int sortedarr[]=sortarr.sortingArray(unsortedarr);
//		
//		for(int element:sortedarr) {
//             System.out.print(element);
//		}fail();
//		}
//		
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");// here i wont allow to execute the exception
//		}
		int unsortedarr[] = null;// {3,4,1,2};
		assertThrows(NullPointerException.class, () -> sortarr.sortingArray(unsortedarr));

	}

}
