package basicPrograms;

public class PalindromeTwo {

	public static void main(String[] args) {

		String a = "121";
		String b = "";
		for (int i = a.length()-1; i >= 0; i--) {
			b = b + a.charAt(i);
			System.out.println(b);
		}
		System.out.println(b);

	}

}
