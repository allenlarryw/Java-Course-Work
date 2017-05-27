import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

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
		array = selectionSortMethod(array);
		System.out.println();
		System.out.println();
		System.out.println("The sorted list using Selection Sort  is : " + (array));

	}

	private static ArrayList<Integer> selectionSortMethod(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		Integer[] newArray = list.toArray(new Integer[list.size()]);

		for (int i = 0; i < newArray.length - 1; i++) {

			int min = i;
			for (int j = i + 1; j < newArray.length; j++)
				if (newArray[j] < newArray[min]) {

					min = j;
				}
			int temp = newArray[i];
			newArray[i] = newArray[min];
			newArray[min] = temp;

			System.out.println();
			for (int a = 0; a < newArray.length; a++) {
				System.out.print(newArray[a] + " "); // prints out each time it
														// gets sorted
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
