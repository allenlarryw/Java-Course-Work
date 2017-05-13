import java.util.*;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] things ={"orange","bacon","apple","orange","ham"};
		
		List<String> list1 = Arrays.asList(things);
		
		System.out.printf("%s", list1);
		
		System.out.println();
		
		
		Set<String> newSet = new HashSet<String>(list1); // removes duplicate iems
		
		System.out.printf("%s ", newSet);
		
	}

}
