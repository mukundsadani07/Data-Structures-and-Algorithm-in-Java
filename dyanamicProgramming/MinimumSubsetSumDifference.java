package dyanamicProgramming;

public class MinimumSubsetSumDifference {
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int range = 0;
	    for(int i=0;i<n;i++){
	        range+=arr[i];
	    }
	    return subsetSum(arr,range);
	}
	public int subsetSum(int[] arr,int range){
	    int n = arr.length;
	    boolean[][] dp = new boolean[n+1][range+1];
	    for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<range+1;i++){
            dp[0][i] = false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<range+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<range/2+1;i++){
            if(dp[n][i]){
                min = Math.min(min,Math.abs(range-2*i));
            }
        }
        return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
