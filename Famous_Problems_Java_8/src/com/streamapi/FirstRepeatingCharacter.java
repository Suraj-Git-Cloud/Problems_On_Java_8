package com.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		
		String input = " Welcome to the pool of Technocrats  ";			
		
		String lowerCaseString = input.toLowerCase();  // case insensitive string
		
		String firstRepeatingCharacter = findFirstRepeatingCharacter(lowerCaseString);
		
		int index = lowerCaseString.indexOf(firstRepeatingCharacter); // to extract the exact character along with its case
		
		System.out.println("First Repeating Character In String : " +input.charAt(index));

	}
	
	public static String findFirstRepeatingCharacter(String input) {
		Map<String, Long> characterFrequencyMap = new HashMap<String, Long>();

		String inputString = input.replaceAll("\\s", "");

		characterFrequencyMap = Arrays.stream(inputString.split(""))
								.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	
		String firstRepeatingCharacter = characterFrequencyMap.entrySet().stream()
											.filter(entry -> entry.getValue() > 1 )
											.map(entry -> entry.getKey())
											.findFirst().get();
		
		return firstRepeatingCharacter;
	}

}
