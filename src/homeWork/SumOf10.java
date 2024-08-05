package homeWork;

import java.util.Scanner;

public class SumOf10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd number : ");
		int c = sc.nextInt();
		System.out.println("Enter the 4th number : ");
		int d = sc.nextInt();
		System.out.println("Enter the 5th number : ");
		int e = sc.nextInt();
		System.out.println("Enter the 6th number : ");
		int f = sc.nextInt();
		System.out.println("Enter the 7th number : ");
		int g = sc.nextInt();
		System.out.println("Enter the 8th number : ");
		int h = sc.nextInt();
		System.out.println("Enter the 9th number : ");
		int i = sc.nextInt();
		System.out.println("Enter the 10th number : ");
		int j = sc.nextInt();

		int add = a + b + c + d + e + f + g + h + i + j;

		System.out.println("The sum of 10 numbers is" + add);

		sc.close();

	}

}
