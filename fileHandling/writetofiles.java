import java.io.*;
import java.lang.*;
import java.util.*;

public class writetofiles {

	private Formatter x;

	public void openFile() {

		try {

			x = new Formatter("pokemon.txt");

		} catch (Exception e) {
			System.out.println("You have an error");

		}

	}

	public void addRecords() {

		x.format("%s %s %s", "24", "allen", "whitley");

	}

	public void closeFile() {

		x.close();
	}
}
