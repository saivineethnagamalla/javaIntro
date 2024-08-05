package day4;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("The value of A is in start " + a);
		System.out.println("The value of B is in start " + b);

		int c = a;
		int d = a += b;
		int e = a -= b;
		int f = a *= b;
		int g = a /= b;
		int h = b /= a;
		int i = a %= b;

		System.out.println("The value of A is " + a);
		System.out.println("The value of B is " + b);
		System.out.println("The value of C is " + c);
		System.out.println("The value of D is " + d);
		System.out.println("The value of E is " + e);
		System.out.println("The value of F is " + f);
		System.out.println("The value of G is " + g);
		System.out.println("The value of H is " + h);
		System.out.println("The value of I is " + i);

	}

}
