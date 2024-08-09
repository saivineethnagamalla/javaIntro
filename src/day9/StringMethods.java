package day9;

public class StringMethods {

	public static void main(String[] args) {

		String str = "check";

		System.out.println(str.length());

		System.out.println(str.concat(" testing"));

		System.out.println(str);
		str = str.concat(" testing");
		System.out.println(str);

		System.out.println(str.charAt(3));
		// 0 when equal , non 0 if not equal
		System.out.println(str.compareTo("check"));
		System.out.println(str.compareTo("test"));

		System.out.println(str.compareToIgnoreCase("CHECK"));
		System.out.println(str.contentEquals("test"));

		char[] ch = { 'a', 'b', 'c' };
		String str1 = "";
		str1 = str1.copyValueOf(ch);
		System.out.println(str1);

		str1 = str1.copyValueOf(ch, 0, 2);
		System.out.println(str1);

		System.out.println(str1.endsWith("b"));
		System.out.println(str1.endsWith("a"));

		System.out.println(str1.equals("ab"));
		System.out.println(str1.equals("abc"));
		System.out.println(str1.equalsIgnoreCase("AB"));

		System.out.println(str1.hashCode());

		System.out.println(str.indexOf('h'));

		System.out.println(str.lastIndexOf('c'));

		System.out.println(str.matches("check"));

		System.out.println(str.matches("(.*)c(.*)"));

		System.out.println(str.replace('c', 'k'));

		System.out.println(str.replaceAll(str, str1));

		System.out.println(str.startsWith("c"));

		System.out.println(str.substring(2));

		System.out.println(str.substring(1, 4));

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());

		System.out.println(str.toString());

		System.out.println("  test the data   ".trim());

	}
}
