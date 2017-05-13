import java.util.*;

public class CreatingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Formatter x; // print to file outputs string

		try {

			x = new Formatter("/Users/Allen/Desktop/runescape.txt");
			System.out.println("You created a file");

		} catch (Exception e) {

			System.out.println("Error");

		}

	}

}
