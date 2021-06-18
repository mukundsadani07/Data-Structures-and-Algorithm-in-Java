package deque;
import java.util.*;
public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d = new LinkedList<Integer>();
		d.offerFirst(10);
		d.offerLast(20);
		d.offerFirst(5);
		d.offerLast(15);
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		d.pollFirst(); 
		d.pollLast();
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
	}

}
