
public class ArrayTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Index\tValue");

		int myArray[] = { 32, 12, 18, 54, 2 };
		int sum = 0;

		for (int counter = 0; counter < myArray.length; counter++) {
			System.out.println(counter + "\t" + myArray[counter]);

			sum += myArray[counter];
		}
		System.out.println();
		System.out.println("this is the sum" + sum);

	}
}