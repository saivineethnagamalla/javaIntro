package basicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, c, i, count = 10;
		//printing 0 and 1    
		System.out.print(a + " " + b);
		//loop starts from 2 because 0 and 1 are already printed    
		for (i = 2; i < count; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}

	}

}
