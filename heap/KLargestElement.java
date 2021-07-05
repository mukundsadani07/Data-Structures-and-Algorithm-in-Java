package heap;

import java.util.Arrays;

public class KLargestElement {
	//T.C: O(nlog(n)+k)
	static void kLargest(int[] arr,int k) {
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=n-1;i>=n-k;i--) {
			System.out.print(arr[i]+" ");
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
