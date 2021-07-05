package heap;

import java.util.PriorityQueue;

public class PurchasingMaximumItemEfficient {
	static int maxItem(int[] arr,int sum) {
		int res = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		//Build heap
		for(int i=0;i<arr.length;i++) {
			q.add(arr[i]);
		}
		while(!q.isEmpty()) {
		if(sum>=q.peek()) {
			sum-=q.peek();
			q.poll();
			res++;
		}else {
			return res;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,12,111,200};
		int p = maxItem(arr,10);
//		int arr[] = {20,10,5,30,100};
//		int p = maxItem(arr,35);
		System.out.println(p);
	}
}
