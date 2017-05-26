import java.util.*;
public class CollectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] things ={"eggs","lasers","hat","pie"};
			
			List<String> list1 = new ArrayList<String>(); // Collection
			
			//add array items to list 
			
			for(String x: things)
				
				list1.add(x);
			 
			 String[] moreThings ={"lasers","hat" };
			 
			 List<String> list2 = new ArrayList<String>(); // Collection
			 
			//add array items to list 
				
				for(String y: moreThings)
					
					list2.add(y);
				
				for(int i=0; i < list1.size(); i++){
					
					System.out.printf("%s ",list1.get(i));
					
				}
			
				editlist (list1,list2); // edit list method removes items from list 1 if its in list 2
				
				System.out.println();
				
					for(int i=0; i < list1.size(); i++){
					
					System.out.printf("%s ",list1.get(i));
					
					}
	}
		 public static void editlist(Collection<String> l1, Collection<String> l2){
			 
			 Iterator<String> iterat = l1.iterator(); // iterator 
			 while(iterat.hasNext()){
				 
				 if (l2.contains(iterat.next())) //if item is in list 2 remove it from list 1
				 iteart.remove();
			 }
			 
		 }
}
