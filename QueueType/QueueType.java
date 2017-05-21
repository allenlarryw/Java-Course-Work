import java.util.*;

public class QueueType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myStuff ={"sword","gem","gold","coins"};
		
		List<String> list1 = new ArrayList<String>();
		
		for(String x: myStuff)
			
			list1.add(x);
		
		for(int i=0; i < list1.size(); i++){
			
			System.out.printf("%s ",list1.get(i));
			
}
		
		
		
		PriorityQueue<String> q = new PriorityQueue<String>();

		q.addAll(list1); // adds the list to the queue
		
		System.out.printf("%s ", q);
		System.out.println();
		System.out.println(q.peek());  //shows the head on the queue
		System.out.println("this was removed from the queue " + q.poll()); //removes the head of the queue
		
		System.out.println(q);
		
		q.add("ring");
		System.out.println(q);
		
	
		System.out.println("Does the queue contain the value specified? " + q.contains("gold")); // returns true  if the value specified is in the queue
		
		System.out.println("is this queue empty? " + q.isEmpty()); //  retruns true if queue is empty
		
		q.remove("gem");
		
		System.out.println(q);
		
		q.removeAll(q); // removes everything from the queue
		
		System.out.print(q);
		
		q.offer("Money");
		System.out.println();
		System.out.print(q);

	}

}
