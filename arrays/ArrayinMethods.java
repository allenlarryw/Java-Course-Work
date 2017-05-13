
public class ArrayinMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArray[] = { 3, 4, 5, 6, 7 };

		changeArray(myArray);

		for (int x : myArray) {
			System.out.println(x);
		}

	}

	// pass an array to this method and adds 5 to each value
	public static void changeArray(int x[]) {

		for (int counter = 0; counter < x.length; counter++) {

			x[counter] += 5;
		}

	}

}
