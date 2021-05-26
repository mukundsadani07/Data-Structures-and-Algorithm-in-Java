package hashing;

import java.util.HashSet;

public class SubarrayWithGivenSumEfficient {
	static boolean givenSum(int[] arr,int x) {
		int n = arr.length;
		HashSet<Integer> s = new HashSet<>();
		int pre_sum = 0;
		for(int i=0;i<n;i++) {
			pre_sum +=arr[i];
			if(s.contains(pre_sum-x)) {
				return true;
			}
			if(pre_sum == x) {
				return true;
			}
			s.add(pre_sum);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,6,13,3,-1};
		System.out.println(givenSum(arr,22));
	}
}
