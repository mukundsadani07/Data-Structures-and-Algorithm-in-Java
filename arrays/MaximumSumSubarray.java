package arrays;

public class MaximumSumSubarray {
	int maxSubarray(int[]arr,int n) {
		int res = 0,curr=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				curr +=arr[i];
				res = Math.max(curr, res);
			} 
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
