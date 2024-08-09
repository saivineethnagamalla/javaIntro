package day8;

public class RightTrianglePattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			//space
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			//print stars
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
