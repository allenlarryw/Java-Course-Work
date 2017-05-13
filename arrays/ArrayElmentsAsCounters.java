import java.util.Random;

public class ArrayElmentsAsCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int frequency[] = new int[7];

		for (int roll = 1; roll < 1000; roll++) {
			++frequency[1 + rand.nextInt(6)];

		}

		System.out.println("Face\tFrequency");

		for (int face = 1; face < frequency.length; face++) {
			System.out.println(face + "\t" + frequency[face]);
		}
	}

}
