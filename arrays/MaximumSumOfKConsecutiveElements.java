package arrays;

public class MaximumSumOfKConsecutiveElements {
	int maxSum(int[] arr,int k) {
		int n = arr.length;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0;i+k-1<n;i++) {
			int sum = 0;
			for(int j=0;j<k;j++) {
				sum +=arr[i+j]; 
				max_sum += Math.max(sum, max_sum);
			}
		}
		return max_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
