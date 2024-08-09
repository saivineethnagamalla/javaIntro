package day10;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 }; // best way
		int num[] = { 4, 5, 6 }; // optional

		int[] numTest = new int[3];
		numTest[0] = 10;
		numTest[1] = 12;
		numTest[2] = 14;

		System.out.println("The length " + numTest.length);
		// printing
		for(int a : num) {
			System.out.println(a);
		}
		
		for (int i = 0; i < numTest.length; i++) {
			System.out.println(numTest[i]);
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		
		// sum
		int sum = 0;
		for (int i = 0; i < numTest.length; i++) {
			sum += numTest[i];
		}
		System.out.println("The Sum is " + sum);

	}

}
