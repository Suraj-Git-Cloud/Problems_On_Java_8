package com.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
