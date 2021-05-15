package arrays;

public class MaximumLengthEvenOddSubarrayEfficient {
	int maxEvenOdd(int[]arr) {
		int n = arr.length;
		int res = 1,curr=1;
		for(int j=1;j<n;j++) {
			if((arr[j]%2 == 0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)) {
				curr++;
				res = Math.max(curr, res);
			}else
				curr = 1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
