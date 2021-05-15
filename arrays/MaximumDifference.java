package arrays;

public class MaximumDifference {
	
	
//	static void maxDiff(int[] arr,int n) {
//		int max = 0;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(arr[j]-arr[i]>max) {
//					max = arr[j] - arr[i];
//				}
//			}
//		}
//		System.out.println("Maximum difference: "+max);
//	}
	
	static void maxDiff(int[] arr,int n) {
		int res = arr[1]-arr[0];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				res = Math.max(res, arr[j]-arr[i]);
			}
		}
		System.out.println("Maximum Difference: "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {10,20,30};
		int[] arr = {2,3,10,6,4,8,1};
		int n = arr.length;
		maxDiff(arr,n);
	}
}
