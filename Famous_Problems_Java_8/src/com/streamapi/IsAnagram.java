package com.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IsAnagram {

	public static void main(String[] args) {

		String input1 = "teacher";
		String input2 = "cheater";

		System.out.println(" Given Two Strings Are Anagrams : " + isAnagram(input1, input2));

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

}
