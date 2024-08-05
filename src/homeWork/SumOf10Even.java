package homeWork;

import java.util.Scanner;

public class SumOf10Even {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		System.out.println("Enter 10 even numbers :");

		while (count < 10) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				sum += num;
				count++;
			} else {
				System.out.println("The number is not even, Please enter only even numbers");

			}

		}

		System.out.println("The sum of the 10 even number is" + sum);
		sc.close();

	}

}
