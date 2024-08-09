package basicPrograms;

public class ArmStrong {

	public static void main(String[] args) {
		int temp, digts = 0, last = 0, sum = 0, check = 153;

		temp = check;
		// loop execute until the condition becomes false
		while (temp > 0) {

			temp = temp / 10;
			digts++;
		}

		temp = check;

		while (temp > 0) {
			// determines the last digit from the number
			last = temp % 10;
			// calculates the power of a number up to digit times and add the resultant to
			// the sum variable
			System.out.println(Math.pow(last, digts));
			sum += (Math.pow(last, digts));
			// removes the last digit
			temp = temp / 10;
		}

		if (check ==sum)
			System.out.println("The given number is Armstrong");
		else
			System.out.println("The given number is not a Armstrong");

	}

}
