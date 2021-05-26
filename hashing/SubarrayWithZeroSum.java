package hashing;

public class SubarrayWithZeroSum {
	static boolean zeroSum(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int curr_sum = 0;
			for(int j=i;j<n;j++) {
				curr_sum += arr[j];
				if(curr_sum == 0) {
					return true;
				}
			}
		}return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,13,-3,-10,5};
		System.out.println(zeroSum(arr));
	}
}


 


