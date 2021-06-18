package hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
	static void lcSubsequence(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int res = 1,curr = 1;
		for(int i=1;i<n;i++) {
			if(arr[i] == arr[i-1]+1)
				curr++;
			else {
				res = Math.max(res, curr);
				curr = 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
