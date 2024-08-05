package day6;

public class LogicalOperators {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("The value of A is in start " + a);
		System.out.println("The value of B is in start " + b);

		if ((a == 10) &&  (a < b))  {
			System.out.println("Both the number are equal and a is less than b");
		}
		if ((a != b) || (a > b)) {
			System.out.println("Both the number are not equal or a is gereter than b");
		}
		
		if(!(a==b)) {
			System.out.println("Both the number are not equal");
		}

	}

}
