package com.ajith.learning;

import java.util.Arrays;

public class SortingArray {// It will generate null pointer exception;

	public int[] sortingArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public int[] sortingarr(int[] arr) {
		for (int i = 0; i < 10000; i++) {
			Arrays.sort(arr);
		}
		return arr;
	}
}
