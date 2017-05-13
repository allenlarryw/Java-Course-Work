
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(5));

	}

	// fact

	public static long fact(long n) { // Recursion 1*2*3*4*5 = 120

		if (n <= 1)

			return 1;
		else

			return n * fact(n - 1);

	}

}
