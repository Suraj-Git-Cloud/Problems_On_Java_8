package com.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the frequency of each character in String irrespective of case using Stream API of Java 8

public class FrequencyOfCharacters {			

	public static void main(String[] args) {

		String input = "Hello world  ";
		Map<String, Long> freqMap = frequencyOfCharacters(input);
		System.out.println("Frequency Of Characters "+freqMap);
		
		// Frequency Of each digit in Number
		
		int input2 = 456234765;
		
		freqMap = frequencyOfCharacters(String.valueOf(input2));
		System.out.println("Frequency Of Digits "+freqMap);
	}

	public static Map<String, Long> frequencyOfCharacters(String input) {
		Map<String, Long> characterFrequencyMap = new HashMap<String, Long>();

		String inputString = input.replaceAll("\\s", ""); // removing spaces

		characterFrequencyMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return characterFrequencyMap;
	}

}
