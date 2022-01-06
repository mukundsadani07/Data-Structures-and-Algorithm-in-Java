package dyanamicProgramming;

public class SubsetSumProblem {
	static Boolean isSubsetSum(int n, int arr[], int sum){
        // code here
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            t[i][0] = true;
        }
        for(int i=1;i<sum+1;i++){
            t[0][i] = false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                   t[i][j] = t[i-1][j]; 
                }
            }
        }
        return t[n][sum];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
