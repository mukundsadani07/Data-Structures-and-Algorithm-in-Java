package arrays;

public class MaximumConsecutiveOnesInABinaryArray {
	int maxOnes(int[]arr,int n) {
		int res = 0;
		for(int i=0;i<n;i++) {
			int curr = 0;
			for(int j=0;j<n;j++) {
				if(arr[j] == 1)
					curr++;
				else
					break;
			}
			res = Math.max(curr, res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
