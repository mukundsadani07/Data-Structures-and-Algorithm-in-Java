package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElement2 {
	//T.C: O(n+klog(n))
	static void kLargest(int[] arr,int k) {
		//Max Heap
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			p.add(arr[i]);
		}
		for(int i=1;i<=k;i++) {
			System.out.println(p.poll()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,15,10,20,8};
		kLargest(arr,2);
//		int[] arr = {8,6,4,10,9};
//		kLargest(arr,3);
	}
}
