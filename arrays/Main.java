
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArray[] = new int[10]; // know size
		int myArray2[] = { 10, 5 }; // if you know the elements
		int myArray3[] = {}; // if you dont know size or number of elements

		myArray[0] = 87;
		myArray[1] = 543;
		myArray[9] = 65;

		for (int counter = 0; counter < myArray.length; counter++) {

			System.out.println(myArray[counter]);
		}
	}

}
