package day8;

public class LeftPascalStar {

	public static void main(String[] args) {

		int total = 5;

		for (int i = 1; i <= total; i++) {
			for (int j = 0; j < total - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= total - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < total - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
