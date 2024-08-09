package day8;

public class DiamondStarPattern {

	public static void main(String[] args) {

		int total = 5;
		// Upside of the program
		for (int i = 1; i <= total; i++) {
			// space
			for (int j = total; j > i; j--) {
				System.out.print(" ");
			}
			// print stars
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Down side of the program
		for (int i = 1; i <= total - 1; i++) {
			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// print stars
			for (int k = (total - i) * 2 - 1; k > 0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
