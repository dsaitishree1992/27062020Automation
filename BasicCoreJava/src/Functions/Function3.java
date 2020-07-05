package Functions;

public class Function3 {

	public static void main(String[] args) {
		// Function return type
		int add = sum(10, 20);
		System.out.println(add);

		boolean c = eligible(10);
		System.out.println(c);

		if (c) {
			System.out.println("your are eligible");
		} else {
			System.out.println("your are not eligible");
		}

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static boolean eligible(int age) {
		if (age > 18) {
			return true;
		} else {
			return false;
		}
	}
}
