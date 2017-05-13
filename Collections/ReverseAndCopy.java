import java.util.*;
public class ReverseAndCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an array and convert to list		
		Character[] nay ={'p','w','n'};
		List<Character> l1 = Arrays.asList(nay);
		System.out.println("List is : ");
		output(l1);
		
		
		
		
		// reverse and print put list
		Collections.reverse(l1);
		System.out.println("After reverse : ");
		output(l1);
		
		//create new array and list 
		
		Character[] newNay = new Character[3];
		List<Character> listCopy = Arrays.asList(newNay);
		
		// copy contents of l1 to listcopy
		
		Collections.copy(listCopy, l1);  //Destination to copy and source to copy from l1
		
		System.out.println("Copy of list l1: ");
		
		output(listCopy);
		
		
		//fil collection with stuff 
		
		Collections.fill(l1, 'X'); // changes everything to x
		System.out.println("After filling the list :");
		output(l1);
		
	}
	//ouput method
	private static void output(List<Character> list) {
		// TODO Auto-generated method stub
		
		for(Character thing: list)
			
			System.out.printf("%s ", thing);
		    System.out.println();
		
		
	}

}
