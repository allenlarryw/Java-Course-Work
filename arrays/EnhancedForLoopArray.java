
public class EnhancedForLoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArray[] = { 3, 4, 5, 6, 7 }; // array
		int total = 0; // holds sum of numbers

		for (int x : myArray) { // 1: type indentifier & 2: array your working
								// with

			total += x;
		}

		System.out.println(total);
	}

}
