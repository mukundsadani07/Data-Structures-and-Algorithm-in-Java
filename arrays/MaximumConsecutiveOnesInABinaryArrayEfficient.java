package arrays;

public class MaximumConsecutiveOnesInABinaryArrayEfficient {
	int maxOnes(int[] arr,int n) {
		int res = 0,curr = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == 0)
				curr = 0;
			else {
				curr++;
				res = Math.max(curr, res);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
