package com.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first non-repeating character in String using Stream API of Java 8

public class FirstNonRepeatingCharacter {					

	public static void main(String[] args) {

		String input = " Welcome to the pool of Technocrats  ";

		String lowerCaseString = input.toLowerCase(); // case insensitive string
														

		String firstNonRepeatedChar = findFirstNonRepeatingCharacter(lowerCaseString);

		int index = lowerCaseString.indexOf(firstNonRepeatedChar); // to extract the exact character along with its case

		System.out.println("First Non-Repeated Character In String : " + input.charAt(index));

	}

	public static String findFirstNonRepeatingCharacter(String input) {
		Map<String, Long> characterFrequencyMap = new HashMap<String, Long>();

		String inputString = input.replaceAll("\\s", "").toLowerCase();

		characterFrequencyMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String firstNonRepeatedChar = characterFrequencyMap.entrySet().stream().
										filter(entry -> entry.getValue() == 1)
										.map(entry -> entry.getKey()).findFirst().get();

		return firstNonRepeatedChar;

	}

}
