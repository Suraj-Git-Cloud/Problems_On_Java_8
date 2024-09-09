package com.streamapi;

import java.util.stream.IntStream;


//Find If Number is Palindrome

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 343;
		System.out.print(isPalindrmNum(number));

	}

	public static boolean isPalindrmNum(int num) {

		String number = String.valueOf(num);
		int bp = number.length() - 1;
		boolean isPalindrom = IntStream.range(0, number.length())
							.allMatch(pos -> number.charAt(pos) == number.charAt(bp - pos));
		return isPalindrom;
	}

}
