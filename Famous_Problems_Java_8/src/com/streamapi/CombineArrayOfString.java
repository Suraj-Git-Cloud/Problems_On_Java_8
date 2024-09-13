package com.streamapi;

import java.util.Arrays;
import java.util.Optional;

public class CombineArrayOfString {

	public static void main(String[] args) {

		String[] inputArray = { "It", "Is", "Java", "World" };
		System.out.println(" The Combined String : " + getCombinedString(inputArray));

	}

	public static Optional<String> getCombinedString(String[] inputArray) {
		Optional<String> combinedString = Arrays.stream(inputArray).reduce((sentence, element) -> sentence+" "+element);

		return combinedString;
	}

}
