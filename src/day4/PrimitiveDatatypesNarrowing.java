package day4;

public class PrimitiveDatatypesNarrowing {

	public static void main(String[] args) {

		double g = 123.678;

		float f = (float) g;

		long e = (long) f;

		int a = (int) e;

		short d = (short) a;

		byte c = 3;

		boolean b = true;
		char h = '6';

		System.out.println("The value of A is " + a);
		System.out.println("The value of B is " + b);
		System.out.println("The value of C is " + c);
		System.out.println("The value of D is " + d);
		System.out.println("The value of E is " + e);
		System.out.println("The value of F is " + f);
		System.out.println("The value of G is " + g);
		System.out.println("The value of H is " + h);
	}

}
