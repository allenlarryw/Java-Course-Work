
public class MultiDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// row 1 row 2
		int multiArray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };

		int multiSecondArray[][] = { { 30, 31, 32, 33 }, { 43 }, { 4, 5, 6 } };

		System.out.println("This is the first array");
		displayArray(multiArray);

		System.out.println("This is the second array");
		displayArray(multiSecondArray);

	}

	public static void displayArray(int x[][]) {

		for (int row = 0; row < x.length; row++) { // finds how many rows are in
													// the array

			// System.out.println("this is the the row lenght" + x.length);

			for (int column = 0; column < x[row].length; column++) { // finds
																		// how
																		// many
																		// columns
																		// are
																		// in
																		// the
																		// row
																		// by
																		// looing
																		// at
																		// the
																		// size
																		// the
																		// column

				// System.out.println("this is the the column lenght" +
				// x[row].length);

				System.out.print(x[row][column] + "\t");

			}
			System.out.println();
		}

	}

}
