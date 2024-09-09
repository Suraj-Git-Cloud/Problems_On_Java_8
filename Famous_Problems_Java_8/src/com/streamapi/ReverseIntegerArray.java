package com.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

// reverse Iteger Array using Stream API of Java 8

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int[] inputarray = {2, 5, 7, 3, 9};
		
		int[] output = reverArray(inputarray);
		
		System.out.println(Arrays.toString(output));
		
	}
	
	public static int[] reverArray(int[] inputArray) {
		
	int[] reverseArray = IntStream.rangeClosed( 1, inputArray.length )
						.map(k -> inputArray[inputArray.length-k]).toArray();	
	
		return reverseArray;
	}

}
