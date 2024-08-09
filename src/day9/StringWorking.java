package day9;

public class StringWorking {
	public static void main(String[] args) {
		String str = "check"; // literal
		String str1 = new String("Test");

		System.out.println(str);
		System.out.println(str1);
		
		str.concat("will it work");
		System.out.println(str);
		
		str = str + "  r u sure??";
		System.out.println(str);
		
		String testing = " ";
		System.out.println(testing.isBlank());
		System.out.println(testing.length());
		System.out.println(testing.isEmpty());


	}

}
