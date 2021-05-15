package deque;
import java.util.*;
public class ImplementationWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d = new LinkedList<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		d.removeFirst();
		d.removeLast();
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
	}

}
