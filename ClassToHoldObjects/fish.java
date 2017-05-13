package classToHoldObjects;

public class fish extends Animal {

	private String fishName = "fisy";
	private String fishBreed = "guppie";

	@Override

	public String toString() {
		return " fish [fishName=" + fishName + ", fishBreed=" + fishBreed + "]";
	}

}
