package hashing;

import java.util.HashSet;

public class SubarrayWithZeroSumEfficient {
	static boolean zeroSum(int[] arr) {
		int n = arr.length;
		HashSet<Integer> s = new HashSet<>();
		int pre_sum = 0;
		for(int i=0;i<n;i++) {
		    pre_sum += arr[i];
			if(s.contains(pre_sum)) {
				return true;
			}
			//corner case
			if(pre_sum == 0) {
				return true;
			}
			s.add(pre_sum);
		}return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,13,-3,-10,5};
		System.out.println(zeroSum(arr));
	}
}
 