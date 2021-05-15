package hashing;

import java.util.HashSet;

public class PairWithGivenSum {
	static boolean pairGivenSum(int[] arr,int k) {
		HashSet<Integer> h = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(h.contains(k-arr[i])) {
				return true;
			} 
			h.add(arr[i]);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,8,15,-8};
		System.out.println(pairGivenSum(arr,17));
	}
}
