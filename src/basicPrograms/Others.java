package basicPrograms;

public class Others {

	public static void main(String[] args) {
		// Random Number Generate
		System.out.println(Math.random());
		System.out.println(Math.random());

		// Compare two objects
		String a = "test", b = "TEST";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));

		// Print ASCII values
		// character whose ASCII value to be found
		char c = 'a';
		int asc = c;
		char d = 'A';
		int asc1 = d;
		System.out.println(asc);
		System.out.println(asc1);
		int asc2 = 'a';
		System.out.println(asc2);

		// for all asci values

		for (int i = 0; i < 255; i++) {
			System.out.println((char) i + "= " + i);
		}

	}

}
