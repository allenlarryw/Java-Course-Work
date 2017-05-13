
public class soda {
	private String first;
	private String last;
	private static int members = 0;

	public soda(String firstName, String lastName) {

		first = firstName;
		last = lastName;
		members++;
		System.out.printf("Construcor for %s %s, members in the club: %d\n", first, last, members);
	}

	public String getfirstName() {

		return first;
	}

	public String getLastName() {

		return last;
	}

	public static int getMembers() {

		return members;
	}

}
