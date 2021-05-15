package dyanamicProgramming;

public class CoinChangeCountCombinationsDP {
	int getCount(int[] coins,int n,int sum) {
		int[][] dp = new int[sum+1][n+1];
		for(int i=0;i<=n;i++) {
			dp[0][i] = 1;
		}
		for(int i=1;i<=sum;i++) {
			dp[i][0] = 0;
		}
		for(int i=1;i<=sum;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j] = dp[i][j-1];
				if(coins[j-1]<=i)
					dp[i][j] +=dp[i-coins[j-1]][i];
			}
		}
		return dp[sum][n];  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
