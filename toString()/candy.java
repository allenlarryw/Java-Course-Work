package toString;

public class candy {

	private String name;
	private soda birthday; // reference to soda object

	public candy(String theName, soda theDate) {

		name = theName;
		birthday = theDate;
	}

	@Override
	public String toString() {
		return String.format("My name is %s, my Birtday is %s", name, birthday);
	}

}
