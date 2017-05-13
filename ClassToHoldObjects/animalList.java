package classToHoldObjects;

public class animalList {

	private Animal[] thelist = new Animal[5];

	private int i = 0;

	public void add(Animal a) {

		if (i < thelist.length) {

			thelist[i] = a;

			System.out.println("An Animal has been added to index " + i + thelist[i]);
			i++;
		}

	}
}
