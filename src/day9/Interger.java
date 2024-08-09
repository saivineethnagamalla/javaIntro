package day9;

public class Interger {

	public static void main(String[] args) {
		Integer a = 10;
		
		System.out.println(a.doubleValue());
		// -1 less than , 0(equal), 1 greater
		System.out.println(a.compareTo(9));
		System.out.println(Integer.compare(4, 5));
		System.out.println(a.equals(15));
		System.out.println(Integer.valueOf("1546"));
		System.out.println(a.toString());
		Integer g = Integer.parseInt("200");
		System.out.println(+g);
		System.out.println(Integer.max(10, 15));
		System.out.println(Integer.min(10, 15));

		// Returns the value obtained by reversing the order of 
		// the bits in thetwo's complement binary representation
		// of the specified intvalue.
		System.out.println(Integer.reverse(1546));

	}
}
