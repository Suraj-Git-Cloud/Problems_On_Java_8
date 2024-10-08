package com.streamapi.intStream;

import java.util.stream.IntStream;


//Find Wheather a given Number is Prime or Not using Stream API of Java 8


public class PrimeNumber {				 

	public static void main(String[] args) {

		int num = 23;
		boolean isPrime = findIsPrime(num);
		
		if(isPrime) {
		System.out.println(" Number Is Prime ");
		}
		else {
			System.out.println(" Number Is Non Prime ");
		}
	}

	public static boolean findIsPrime(int num)	{

		return (num > 1 && IntStream.range(2, num).noneMatch(n -> num % n == 0));

	}
}
