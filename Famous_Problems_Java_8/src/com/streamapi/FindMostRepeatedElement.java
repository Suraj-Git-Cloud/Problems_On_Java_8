package com.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


//Find Most Repeatable Element in Array using Stream API of Java 8


public class FindMostRepeatedElement {

	public static void main(String[] args) {

		String[] inputArray = { "web", "java", "c", "dotNet", "java", "python", "react", "ang", "python" };

		System.out.println(" Most Repeatable Element : " + findMostRepeatable(inputArray));

	}

	public static String findMostRepeatable(String[] inputArray) {

		Map<String, Long> wordFrequencyMap = Arrays.stream(inputArray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		String element = wordFrequencyMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		return element;
	}

}
