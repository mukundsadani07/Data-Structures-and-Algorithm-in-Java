package dyanamicProgramming;

public class O1KnapSackMemoization {
	static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] t = new int[n+1][w+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<w+1;j++){
                 t[i][j] = -1; 
             }
         }
         return knapS(w,wt,val,n,t);
    } 
    static int knapS(int w,int[] wt,int val[],int n,int[][] t){
        if(n==0 || w == 0){
             return 0;
         }
         if(t[n][w]!=-1){
             return t[n][w];
         }
         if(w>=wt[n-1]){
             return t[n][w] = Math.max(val[n-1]+knapS(w-wt[n-1],wt,val,n-1,t),knapS(w,wt,val,n-1,t));
         }else{
             return t[n][w] = knapS(w,wt,val,n-1,t);
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
