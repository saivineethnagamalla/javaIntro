package day10;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		int[] numberArray = { 30, 40, 19, 20 };

		int[] numberArray2 = { 30, 40, 19 };
		
		int[] numberArrayshort = { 10, 20, 30 };

		System.out.println(Arrays.binarySearch(numberArrayshort, 20));

		System.out.println(Arrays.equals(numberArray, numberArray2));

		for (int i = 0; i < numberArray2.length; i++) {
			System.out.println(numberArray2[i]);
		}

		Arrays.fill(numberArray2, 4);

		for (int i = 0; i < numberArray2.length; i++) {
			System.out.println(numberArray2[i]);
		}

		System.out.println("After sorting");
		Arrays.sort(numberArray);
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}

	}

}
