package day9;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("check");
		str.append(" testing");

		System.out.println(str);

		System.out.println(str.reverse());

		System.out.println(str.delete(0, 7));

		System.out.println(str.insert(0, "testing"));

		System.out.println(str.replace(0, 7, "working"));

	}

}
