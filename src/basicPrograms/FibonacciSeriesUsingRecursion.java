package basicPrograms;

public class FibonacciSeriesUsingRecursion {

	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		int count = 10;
		//printing 0 and 1    
		System.out.print(a + " " + b);
		//n-2 because 2 numbers are already printed   
		fibona(count-2);

	}

	public static void fibona(int count) {

		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			fibona(count-1);
		}
	}
}
