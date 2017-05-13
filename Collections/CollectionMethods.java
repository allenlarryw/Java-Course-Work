import java.util.*;
public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// convert array to list
		String[] stuff = {"oranges","soda","Chicken","milk"};
		List<String> list1 = Arrays.asList(stuff);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("youtube");
		list2.add("google");
		list2.add("reddit");
		
		for( String x : list2)
			System.out.printf("%s ",x);
		
		
		Collections.addAll(list2, stuff); //adds stuff to the list 2
		
		System.out.println();
		
		for( String x : list2)
			System.out.printf("%s ",x);
		
		//frequency method
		System.out.println(Collections.frequency(list2, "soda")); // outputs how many times something appears in the list
		
		
		
		//disjoint method returns true if nothing in common checks a list against a list
		
		 boolean tof = Collections.disjoint(list1, list2);
		 System.out.println(tof); 
		
		
		if(tof) // true
			System.out.println("these list do not have anything in common");
		else// false
			System.out.println("These list have stuff in common");
		
		
		
	}
	
	

}
