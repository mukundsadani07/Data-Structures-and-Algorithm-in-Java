package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(10);
		q.add(5);
		q.add(20);
		System.out.println(q);
		System.out.println(q.poll());  //10
		System.out.println(q.peek());  //5
		System.out.println(q.size());  //2
		System.out.println(q);
	}

}
