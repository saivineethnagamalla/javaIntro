package day10;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {

		int[] numScan = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in array ");

		for (int i = 0; i < numScan.length; i++) {
			numScan[i] = sc.nextInt();
		}

		for (int i = 0; i < numScan.length; i++) {
			System.out.println(numScan[i]);
		}

		sc.close();
	}

}
