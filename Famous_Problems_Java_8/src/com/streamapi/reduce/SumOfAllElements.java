package com.streamapi.reduce;

import java.util.Arrays;

public class SumOfAllElements {

	public static void main(String[] args) {

		int[] inputArray = { 4, 2, 1, 3 };

		Integer output = getSumOfAllNumbers(inputArray);
		System.out.println(" The Combined String : " + output);

	}

	public static Integer getSumOfAllNumbers(int[] inputArray) {

		Integer[] input = (Integer[]) Arrays.stream(inputArray).boxed().toArray(Integer[]::new);

		Integer sumOfNumbers = Arrays.stream(input).reduce(0, (element1, element2) -> element1 + element2);

		return sumOfNumbers;
	}
}
