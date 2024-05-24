package com.ajith.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void test() {
		SortingArray sa = new SortingArray();
		int unsorted[] = { 2, 3, 1, 7, 4 };
		assertTimeout(Duration.ofMillis(15), () -> sa.sortingarr(unsorted));
	}

}
