package day9;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Testing";

		System.out.println("Before : " + str);

		char[] strArray = str.toCharArray();

		System.out.println("With cahr : " + strArray.length);

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println(" ");
		System.out.println("After : ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
	}
}
