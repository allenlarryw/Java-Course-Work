package toString;

public class soda {

	private int month;
	private int day;
	private int year;

	public soda(int m, int d, int y) {
		month = m;
		day = d;
		year = y;

		System.out.printf("The Construcor for this is %s\n", this);

	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s", month, day, year);
	}

}
