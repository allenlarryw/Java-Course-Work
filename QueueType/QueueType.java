import java.util.*;

public class QueueType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<String>();

		q.offer("first");
		q.offer("second");
		q.offer("third");

		System.out.printf("%s ", q);
		System.out.println();

		System.out.printf("%s ", q.peek());
		System.out.println();

		q.poll();

		System.out.printf("%s ", q);

		System.out.println();

		System.out.printf("%s ", q.peek());
	}

}
