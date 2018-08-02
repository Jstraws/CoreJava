package com.revature.main;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] intArray = {5, 6, 2, 4, 1, 3};
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}

}