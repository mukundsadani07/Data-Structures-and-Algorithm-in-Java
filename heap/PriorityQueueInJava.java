package heap;

import java.util.PriorityQueue;

public class PriorityQueueInJava {

	public static void main(String[] args) {
		
		//Min Heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(15);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
	}

}
