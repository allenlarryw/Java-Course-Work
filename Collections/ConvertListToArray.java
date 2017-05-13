import java.util.*;
public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stuff ={"babies","watermelon","melon","fudge"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff)); // converts array to list
		
		thelist.add("pumpkin");
		thelist.addFirst("firstThing");
		
		// convert list back to an array
		
		stuff = thelist.toArray(new String[thelist.size()]); // converts list to array
		
		for(String x : stuff)
			System.out.printf("%s ", x);
		
	}

}
