
public class GenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] iRay = { 1, 2, 3, 4 };

		Character[] cRay = { 'a', 'l', 'l', 'e', 'n' };

		printMe(iRay);
		printMe(cRay);

	}

	public static <T> void printMe(T[] x) { // generic type , generic type of T

		for (T b : x)
			System.out.printf("%s ", b);
		System.out.println();

	}

}
