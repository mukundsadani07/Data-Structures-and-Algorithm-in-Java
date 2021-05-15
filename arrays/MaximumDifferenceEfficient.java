package arrays;

public class MaximumDifferenceEfficient {
	  static void maxDiff(int[] arr,int n) {
		 int res = arr[1] - arr[0];
		 int minVal = arr[0];
		 for(int j=1;j<n;j++) {
			 res = Math.max(res, arr[j]- minVal);
			 minVal = Math.min(minVal, arr[j]);
		 }
		 System.out.println("Maximum difference: "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,10,6,4,8,1};
		int n = arr.length;
		maxDiff(arr,n);
	}

}
