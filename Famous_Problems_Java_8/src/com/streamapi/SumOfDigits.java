package com.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find Sum of Digits of a given Number using Stream API

public class SumOfDigits {

	public static void main(String[] args) {

		Integer input = 343;
		System.out.println(" Sum Of Digits Of Number : " + sumOfDigits(input));

	}

	public static Integer sumOfDigits(int num) {
		Integer sumOfDigits = Stream.of(String.valueOf(num).split(""))
								.collect(Collectors.summingInt(Integer::parseInt));

		return sumOfDigits;
	}

}
