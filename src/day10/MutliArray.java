package day10;

public class MutliArray {

	public static void main(String[] args) {

		int[][] numberArray = new int[3][3];
		numberArray[0][0] = 1;
		numberArray[0][1] = 2;
		numberArray[0][2] = 3;
		numberArray[1][0] = 4;
		numberArray[1][1] = 5;
		numberArray[1][2] = 6;
		numberArray[2][0] = 7;
		numberArray[2][1] = 8;
		numberArray[2][2] = 9;

		System.out.println(+numberArray[0][2]);

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(+numberArray[i][j]);

			}
			System.out.println();

		}

		System.out.println("For the next array");

		int[][] numberArray2 = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 2; j++) {
				System.out.print(+numberArray2[i][j]);

			}
			System.out.println();
		}
	}
}
