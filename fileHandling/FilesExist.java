import java.io.File;

public class FilesExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File x = new File("/Users/Allen/Desktop/pokemon.rtf");

		if (x.exists())
			System.out.println(x.getName() + " This file exist");
		else
			System.out.println("This file doesn't exist");

	}

}
