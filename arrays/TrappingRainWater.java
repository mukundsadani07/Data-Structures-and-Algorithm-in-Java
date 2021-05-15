package arrays;

public class TrappingRainWater {
	int getWater(int[] arr,int n) {
		int res = 0;
		for(int i=1;i<n-1;i++) {
			
			int lMax = arr[i];
			for(int j=0;j<i;j++)
				lMax = Math.max(lMax, arr[j]);
			
			int rMax = arr[i];
			for(int j=i+1;j<n;j++)
				rMax = Math.max(rMax, arr[i]);
			
			res = res + (Math.min(lMax, rMax) - arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
