package hashing;

import java.util.HashSet;

public class CountDistinctElementsEfficient {
	public static int countDistinct(int[] arr) {
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		return h.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,12,13,12,13,13,18};
//		int[] arr = {10,10,10};
		int p = countDistinct(arr);
		System.out.println(p);
	}
}
