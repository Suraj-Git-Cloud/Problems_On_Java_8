package com.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Find All Duplicate Characters In String using Stream API of Java 8

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		String input = " I am a Java developer working on TavaStack Technologies ";

		System.out.print(duplicateCharacters(input));
	}

	public static Set<String> duplicateCharacters(String input) {

		Set<String> duplicateCharSet = new HashSet<String>();

		Set<String> resultSet = Arrays.stream(input.toLowerCase().replaceAll("\\s", "").split(""))
				.filter(ch -> !duplicateCharSet.add(ch)).sorted().collect(Collectors.toSet());

		return resultSet;
	}

}
