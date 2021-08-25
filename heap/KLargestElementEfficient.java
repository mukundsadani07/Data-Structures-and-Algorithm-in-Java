package heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElementEfficient {
	//Max Heap: O(n+klogk) 
	
	//Min Heap: O(k+(n-k)*logk)
	static void kLargest(int[] arr,int k) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		for(int i=0;i<k;i++) {
			p.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>p.peek()) {
				p.poll();
				p.add(arr[i]);
			}
		}
		Iterator<Integer> i = p.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {5,15,10,20,8};
//		kLargest(arr,2);
		int[] arr = {8,6,4,10,9};
		kLargest(arr,3);
	}
}
