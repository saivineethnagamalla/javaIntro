package basicPrograms;

public class Palindrome {

	public static void main(String[] args) {

		int a = 16161, sum = 0, temp, r;

		temp = a;
		while (a > 0) {
			// getting remainder
			r = a % 10;
			sum = (sum * 10) + r;
			System.out.println(sum);
			a = a / 10;
		}
		if (temp == sum)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");

	}

}
