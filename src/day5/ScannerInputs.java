package day5;

import java.util.Scanner;

public class ScannerInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the company ");
		String companyName = sc.nextLine();
		System.out.println("Enter the owner name of the company ");
		String ownerName = sc.nextLine();
		System.out.println("The name of the company is " + companyName);
		System.out.println("The owner of the company is " + ownerName);
		
		sc.close();

	}

}
