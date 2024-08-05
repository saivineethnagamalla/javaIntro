package day6;

public class MiscellaneousOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("The value of A is in start " + a);
		System.out.println("The value of B is in start " + b);

		int c = (a == 15) ? 12 : 13;

		System.out.println("The value of C is in start " + c);

		int d = a++;

		System.out.println("The value of D is in start " + d);

		int e = b--;

		System.out.println("The value of E is in start " + e);
		
		System.out.println("The value of A is in last " + a);
		System.out.println("The value of B is in last " + b);

	}

}
