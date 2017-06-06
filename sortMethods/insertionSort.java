import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		System.out.println("Please enter Your Favorite numbers, then 0 when finished");

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
		array = insertionSortMethod(array);
		System.out.println();
		System.out.println();
		System.out.println("The sorted list using Selection Sort  is : " + (array));

	}

	private static ArrayList<Integer> insertionSortMethod(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		Integer[] newArray = list.toArray(new Integer[list.size()]);

		for (int i = 1; i < newArray.length; i++) {

			System.out.println();
			int index = newArray[i];
			int j = i;

			while (j > 0 && newArray[j - 1] > index) { // 1 j-1 8 > 5
				newArray[j] = newArray[j - 1];

				j--;
			}
			newArray[j] = index;

			for (int b = 0; b < newArray.length; b++) {
				System.out.print(newArray[b] + " "); // prints out each sort
			}

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
