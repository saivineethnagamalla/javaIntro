package day10;

public class Arrays2 {

	public static void main(String[] args) {
		int[][] numberArray2 = { { 1, 2 }, { 4, 5 }, { 7, 8 } };

		for (int i = 0; i < numberArray2.length; i++) {
			for (int j = 0; j < numberArray2[0].length; j++) {
				System.out.print(+numberArray2[i][j] + " ");

			}
			System.out.println();
		}

	}

}
