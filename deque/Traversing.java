package deque;

import java.util.*;
public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer>d = new LinkedList<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		Iterator it = d.iterator();
		
		while(it.hasNext())
			System.out.println(it.next()+" ");
		System.out.println();
		
		for(int x:d)
			System.out.println(x+"");
		System.out.println();
	}  

}
