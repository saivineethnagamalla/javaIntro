package day4;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		
		System.out.println("The value of a-b " + (a - b));
		System.out.println("The value of a*b " + (a * b));
		System.out.println("The value of a/b " + (a / b));
		System.out.println("The value of a%b " + (a % b));
		System.out.println("The value of b%a " + (b % a));

	}

	public int check() {
		System.out.println("The value of a+b " + add(4,5));
		return 0;
	}
	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

}
