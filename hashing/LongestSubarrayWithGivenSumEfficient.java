package hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSumEfficient {
	static int longestSubarray(int[] arr,int x) {
		int n = arr.length;
		HashMap<Integer,Integer> m = new HashMap<>();
		int pre_sum = 0,res = 0;
		for(int i=0;i<n;i++) {
			pre_sum += arr[i];
			// when subarray starts from index '0'
			if(pre_sum == x) {
				res = i+1;
			}
			// make an entry for 'sum' if it is
            // not present in 'map'
			if(!m.containsKey(pre_sum)){
				m.put(pre_sum, i);
			}
			// check if 'sum-k' is present in 'map'
            // or not
			if(m.get(pre_sum - x) != null) {
				// update maxLength
				res = Math.max(res, i-m.get(pre_sum - x));
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,3,1,5,-6,6,2,2};
		System.out.println(longestSubarray(arr,4));
	}
}
