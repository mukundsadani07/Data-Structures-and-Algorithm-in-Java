package arrays;

public class MaximumSumSubarrayEfficient {
	static int maxSubarray(int[] arr) {
		int n = arr.length;
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<n;i++) {
			maxEnding = Math.max(maxEnding+ arr[i], arr[i]);
			res = Math.max(res, maxEnding);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,8,-2,4,-5,6};
		int p = maxSubarray(arr);
		System.out.println(p);
	}
}
