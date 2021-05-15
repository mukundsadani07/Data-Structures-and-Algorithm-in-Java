package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueForMaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(10);
		pq.add(20);
		pq.add(15);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
	}

}
