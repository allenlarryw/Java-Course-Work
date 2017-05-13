
public enum candy {

	chris("awsome", "20"), allen("nice", "24"), jeremy("happy", "25"), phillip("cool", "24"), todd("weird",
			"18"), josh("stinks", "15");

	private final String desc;

	private final String year;

	candy(String description, String date) {

		desc = description;
		year = date;

	}

	public String getDesc() {

		return desc;
	}

	public String getYear() {

		return year;
	}
}
