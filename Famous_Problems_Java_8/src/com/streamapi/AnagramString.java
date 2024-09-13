package com.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;


//Find Weather Two Strings Are Anagrams or Not using Stream API of Java 8

public class AnagramString {				
	public static void main(String[] args) {

		String input1 = "teacher";
		String input2 = "cheater";

		System.out.println(" Given Two Strings Are Anagrams : " + isAnagram(input1, input2));
		System.out.println(" Given Two Strings Are Anagrams : " + isAnagramJava7Approach(input1, input2));
	}

	public static Boolean isAnagram(String input1, String input2) {

		boolean isAnagramOdEachOther = false;
		String sortedInput1 = Arrays.stream(input1.split(""))
								.map(s -> s.toLowerCase())
								.sorted()
								.collect(Collectors.joining());

		String sortedInput2 = Arrays.stream(input2.split(""))
								.map(s -> s.toLowerCase())
								.sorted()
								.collect(Collectors.joining());

		if (sortedInput1.equals(sortedInput2))
			isAnagramOdEachOther = true;

		return isAnagramOdEachOther;
	}
	
	public static Boolean isAnagramJava7Approach(String input1, String input2) {

		boolean isAnagramOfEachOther = false;
		char[] charArray1 = input1.toCharArray();
		char[] charArray2 = input2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		String output1 = String.valueOf(charArray1);
		String output2 = String.valueOf(charArray2);
		;

		if (output1.equals(output2))
			isAnagramOfEachOther = true;

		return isAnagramOfEachOther;

	}


}
