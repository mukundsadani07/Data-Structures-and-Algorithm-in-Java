package hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequenceEfficient {
	static int lsSubsequence(int[] arr) {
		int n = arr.length;
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			h.add(arr[i]);
		}
		int res = 1;
		for(int i=0;i<n;i++) {
			if(h.contains(arr[i]-1)) {
				int curr = 1;
				while(h.contains(arr[i]+curr)) {
					curr++;
				}
				res = Math.max(res,curr);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
