package com.streamapi;

import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;

public class ConvertPrimitiveIntArrayToWrapperIntegerArray {

	public static void main(String[] args) {

		int[] primitiveArray = { 1, 2, 3, 4, 5 };

		Integer[] wrapperArray = convertToWrapperArrayJava8(primitiveArray);
		System.out.println(" Primitive Int Array Converted To Wrapper Integer Array Using Java 8 "
				+ Arrays.toString(wrapperArray));

	}

	public static Integer[] convertToWrapperArrayJava8(int[] primitiveArray) {

		Integer[] wrapperArray = Arrays.stream(primitiveArray) // IntStream
				.boxed() // Stream<Integer>
				.toArray(Integer[]::new); // Array Of Wrapper

		return wrapperArray;
	}
	
	
	
	

	/* public static void convertToWrapperArrayApacheCommonLang(int[] primitiveArray) {

		 Add Apache Common Lang to use ArrayUtils utility method

		 Integer[] wrapperArray = ArrayUtils.toObject(primitiveArray); 

		 System.out.println(" Primitive Int Array Converted To Wrapper Integer Array Using Apache Common Library "+ Arrays.toString(wrapperArray));
	} */
}
