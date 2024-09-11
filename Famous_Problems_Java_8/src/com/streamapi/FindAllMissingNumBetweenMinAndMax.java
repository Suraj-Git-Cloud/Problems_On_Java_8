package com.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FindAllMissingNumBetweenMinAndMax {

	public static void main(String[] args) {

		Integer[] inputArray = { 3, 5, 8, 2, 5, 9, 13, 15, 3 };

		int[] outputArray = findMissingNumber(inputArray);

		System.out.println(Arrays.toString(outputArray));

	}

	public static int[] findMissingNumber(Integer[] inputArray) {

		Set<Integer> uniqueSet = new HashSet(Arrays.asList(inputArray));
		Integer minValue = Arrays.stream(inputArray).min((i1, i2) -> i1.compareTo(i2)).get();
		Integer maxValue = Arrays.stream(inputArray).min((i1, i2) -> i2.compareTo(i1)).get();

		System.out.println(" Min Value : " + minValue);
		System.out.println(" Max Value : " + maxValue);

		int[] outputArray = IntStream.rangeClosed(minValue, maxValue).filter(k -> !uniqueSet.contains(k)).toArray();

		return outputArray;
	}

}
