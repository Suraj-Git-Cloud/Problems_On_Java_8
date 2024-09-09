package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;

//Find The Second Largest Element In Array using Stream API of Java 8	

public class FindSecondLargestNumber {								

	public static void main(String[] args) {

		Integer inputArray[] = { 54, 21, 51, 65, 51, 42, 31, 57, 98, 56 };

		System.out.println(findSecondLargestNumInArray(inputArray));

	}

	public static Integer findSecondLargestNumInArray(Integer[] inputArray) {
		Integer secondLargestNum = Arrays.stream(inputArray).sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();

		return secondLargestNum;
	}

}
