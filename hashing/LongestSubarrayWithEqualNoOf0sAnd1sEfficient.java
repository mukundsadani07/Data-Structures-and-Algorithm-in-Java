package hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqualNoOf0sAnd1sEfficient {
	static int longestSubarray(int[] arr) {
		int n = arr.length;
		HashMap<Integer,Integer> m = new HashMap<>();
		int res = 0;
		int prev_sum = 0;
	
		for(int i=0;i<n;i++) {
			if(arr[i] == 0)
				arr[i] = -1;
			prev_sum +=arr[i];
			if(prev_sum == 0)
				res = i+1;
			if(!m.containsKey(prev_sum)) {
				m.put(prev_sum, i);
			}
			if(m.get(prev_sum)!=null) 
				res = Math.max(res, i-m.get(prev_sum));
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {0,0,1,1,1,1,0};
		int[] arr = {1,1,0,1,0};
//		int[] arr = {1,1,0,1,1,0};
		System.out.println(longestSubarray(arr));
	}
}
