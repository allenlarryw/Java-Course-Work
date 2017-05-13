
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(average(20, 45, 60));
	}

	public static int average(int... numbers) {

		int total = 0;
		for (int x : numbers)
			total += x;

		return total / numbers.length;

	}
}
