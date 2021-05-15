package sorting;

import java.util.Arrays;

public class KthSmallestElement {
	static void kth(int[] arr,int k) {
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,30,12};
		kth(arr,2);
	} 
}
