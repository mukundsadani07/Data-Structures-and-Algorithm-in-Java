package arrays;

//Given and array of integers & a no. k, find the maximum sum of k consecutive elements.
public class WindowSlidingTechnique1 {
	
	//O(n^2)
	static int maxSum(int[] arr,int k) {
		int n = arr.length;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0;i+k-1<n;i++) {
			int sum = 0;
			for(int j=0;j<k;j++) {
				sum +=arr[i+j]; 
				max_sum = Math.max(sum, max_sum);
			}
		}
		return max_sum;
	}
	
	//O(n)
	static int windowSliding(int[] arr,int k) {
		int n = arr.length;
		int curr_sum = 0;
		for(int i=0;i<k;i++)
			curr_sum += arr[i];
		 
		int max_sum = curr_sum;
		for(int i=k;i<n;i++) {
			curr_sum +=(arr[i] - arr[i-k]);
			max_sum = Math.max(max_sum, curr_sum);
		}
		return max_sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,30,-5,20,7};
		int k = 3;
//		int p = windowSliding(arr,k);
		int p = maxSum(arr,k);
		System.out.println(p);
	}

}
