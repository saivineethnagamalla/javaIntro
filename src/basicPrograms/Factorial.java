package basicPrograms;

public class Factorial {

	public static void main(String[] args) {
		int value = 6;
		int finalValue = 1;
		for (int i = 1; i <= value; i++) {
			finalValue = finalValue * i;
		}
		System.out.println("Factorial for " + value  +" " +"is "  + finalValue);
	}

}
