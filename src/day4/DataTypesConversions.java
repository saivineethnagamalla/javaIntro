package day4;

public class DataTypesConversions {

	public static void main(String[] args) {
		boolean b = true;
		byte c = 3;
		short d = c;//byte
		long e = d;//short
		float f = d;//long
		double g = d;//float
		char h = 'A';
		int a = h;
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
