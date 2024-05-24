package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayExceptionTest {
	SortingArray sortarr = new SortingArray();

	@Test
	void test() {
		int unsortedarr[] = { 3, 4, 1, 2 };
		try {
			int sortedarr[] = sortarr.sortingArray(unsortedarr);

			for (int element : sortedarr) {
				System.out.print(element);
			}
			fail();
		}

		catch (NullPointerException e) {
			System.out.println("Exception generated");// here i wont allow to execute the exception
		}
	}

}
