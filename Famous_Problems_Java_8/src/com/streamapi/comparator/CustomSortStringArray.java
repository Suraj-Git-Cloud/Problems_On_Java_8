package com.streamapi.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Custom sort  Array of String in ascending order of Length using Stream API of Java 8


public class CustomSortStringArray {

	public static void main(String[] args) {
		String[] inputArray = { "web", "java", "c", "dotNet", "java", "python", "react", "ang", "python", "java" };

		List<String> customSortedList = customSortArray(inputArray);

		System.out.println(customSortedList);

	}

	public static List<String> customSortArray(String[] inputArray) {

		List<String> customSortedList = Arrays.stream(inputArray).sorted(Comparator.comparing(String::length))
										.collect(Collectors.toList());

		return customSortedList;
	}
}
