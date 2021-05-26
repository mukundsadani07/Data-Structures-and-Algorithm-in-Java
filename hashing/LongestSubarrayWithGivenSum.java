package hashing;

public class LongestSubarrayWithGivenSum {
	static int longestSubArray(int[] arr,int x) {
		int n = arr.length;
		int res = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum == x) {
					res = Math.max(j-i+1, res);
				}
			}
		}return res; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {5,8,-4,-4,9,-2,2};
//		System.out.println(longestSubArray(arr,0));
		int[] arr = {3,1,0,1,8,2,3,6};
		System.out.println(longestSubArray(arr,5));
	}
}
