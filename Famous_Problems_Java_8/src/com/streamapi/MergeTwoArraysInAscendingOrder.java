package com.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysInAscendingOrder {

	public static void main(String[] args) {

		int[] array1 = { 10, 3, 5, 21, 9, 8 };
		int[] array2 = { 4, 12, 1, 3, 7, 21, 38, 9 };

		int result[] = mergeArray(array1, array2);

		System.out.println(result); // prints only the reference ex - [I@17f052a3

		System.out.println(Arrays.toString(result)); // prints the elements of array ex - [1, 3, 4, 5, 7, 8, 9, 10, 12,
														// 21, 38]

	}

	public static int[] mergeArray(int[] array1, int[] array2) {
		
		int result[] = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
						.sorted().distinct().toArray();
		return result;

	}

}
