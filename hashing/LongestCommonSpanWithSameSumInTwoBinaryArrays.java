package hashing;

public class LongestCommonSpanWithSameSumInTwoBinaryArrays {
	static int commonSpan(int[] arr1,int[] arr2) {
		int n1 =arr1.length;
		int n2 = arr2.length;
		int res = 0;
		int x = Math.max(n1, n2);
		for(int i=0;i<x;i++) {
			int sum1=0,sum2=0;
			for(int j=i;j<x;j++) {
				sum1+=arr1[j];
				sum2+=arr2[j];
				if(sum1 == sum2) {
					res = Math.max(res, j-i+1);
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = {0,1,0,0,0,0};
//		int[] arr2 = {1,0,1,0,0,1};
		int[] arr1 = {0,1,0,1,1,1,1,1};
		int[] arr2 = {1,1,1,1,1,1,0,1};
		System.out.println(commonSpan(arr1,arr2));
	}
}
