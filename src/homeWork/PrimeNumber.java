package homeWork;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");

		int num = sc.nextInt();
		if (prime(num)) {
			System.out.println("The given number is prime");

		} else {
			System.out.println("The given number is not prime");

		}
		sc.close();

	}

	private static boolean prime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
