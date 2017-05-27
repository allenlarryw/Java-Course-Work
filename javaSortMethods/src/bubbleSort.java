import java.lang.reflect.Array;
import java.util.*;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		System.out.println("Please enter Your Favorite numbers, then 0 when finnished");

		int numbers = input.nextInt();
		while (numbers != 0) {

			array.add(numbers);

			numbers = input.nextInt();

		}

		System.out.println("What number would you like to delete?");
		printArray(array);

		int del = input.nextInt();
		for (int i = 0; i < array.size(); i++) {

			if (array.get(i) == del)
				array.remove(i);

		}
		System.out.println("Your numbers after you have deleted one");
		printArray(array);
		System.out.println();
		System.out.println();
		array = bubbleSortMethod(array);
		System.out.println("The sorted list using Bubble Sort  is : " + (array));

	}

	private static ArrayList<Integer> bubbleSortMethod(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		Integer[] newArray = list.toArray(new Integer[list.size()]);

		for (int c = 0; c < newArray.length - 1; c++) {

			for (int d = 0; d < newArray.length - c - 1; d++) {

				if (newArray[d] > newArray[d + 1]) {

					int swap = newArray[d];
					newArray[d] = newArray[d + 1];
					newArray[d + 1] = swap;

				}

			}

			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " "); // prints out each sort
			}
			System.out.println();

		}

		ArrayList<Integer> finalList = new ArrayList<Integer>(Arrays.asList(newArray));

		return finalList;

	}

	private static void printArray(ArrayList<Integer> array) {
		// TODO Auto-generated method stub

		for (int i : array)
			System.out.print(i + " ");
	}
}