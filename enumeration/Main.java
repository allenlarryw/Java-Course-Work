import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (candy people : candy.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

		System.out.println("\nAnd now for the range of constants!!!\n");

		for (candy people : EnumSet.range(candy.jeremy, candy.todd))

			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

	}

}
