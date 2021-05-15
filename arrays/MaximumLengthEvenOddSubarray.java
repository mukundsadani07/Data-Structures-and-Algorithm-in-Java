package arrays;

public class MaximumLengthEvenOddSubarray {
	static int maxEvenOdd(int[] arr) {
		int n = arr.length;
		int res = 1;
		for(int i=0;i<n;i++) {
			int lmax = 1;
			for(int j=i+1;j<n;j++) {
				if((arr[j]%2 == 0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)) {
					lmax++;
				}
				else {
					break;
				}
			}
			res = Math.max(res, lmax);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,12,14,7,8};
		int p = maxEvenOdd(arr);
		System.out.println(p);
		
	}
}
