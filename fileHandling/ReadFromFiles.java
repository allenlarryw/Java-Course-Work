import java.io.*;
import java.util.*;

public class ReadFromFiles {

	private Scanner x;

	public void openFile() {
		try {

			x = new Scanner(new File("pokemon.txt"));

		} catch (Exception e) {

			System.out.println("could not find file");
		}

	}

	public void readFile() {
		while (x.hasNextLine()) {

			String a = x.next();
			String b = x.next();
			String c = x.next();

			System.out.printf("%s %s %s", a, b, c);
			System.out.println();

		}

	}

	public void closeFile() {

		x.close();
	}

}
