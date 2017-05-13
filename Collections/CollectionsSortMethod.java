import java.util.*;
public class CollectionsSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] junk = {"oranges","lemons","apples","candy","soda"};
		
		
		List<String> l1 = Arrays.asList(junk); // converts array to list
		
		
	 Collections.sort(l1); // sorts list in alphabetical order
	 
	 System.out.printf("%s\n", l1);
	 
	 
	 Collections.sort(l1, Collections.reverseOrder()); // sorts list backwards
		
	 System.out.printf("%s\n", l1); 
		
		
		
		
		
		
		
		
		
		
	}

}
