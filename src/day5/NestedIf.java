package day5;

public class NestedIf {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a == 10) {
			System.out.println("a is equal to 10");
			if (b == 30)
				System.out.println("b is equal to 20");
			else if (a > b)
				System.out.println("b is smaller than a");
		}
	}

}
