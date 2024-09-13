package com.streamapi.reduce;

import java.util.stream.IntStream;

public class ProductOfNumInRange {

	public static void main(String[] args) {

		int start = 2;
		int end = 8;

		Integer output = getSumOfAllNumbers(start, end);
		System.out.println(" The Product Of Numbers within Range : " + output);

	}

	public static Integer getSumOfAllNumbers(int start, int end) {

		Integer product = IntStream.range(start, end).reduce((num1, num2) -> num1 * num2).getAsInt();

		return product;
	}

}
