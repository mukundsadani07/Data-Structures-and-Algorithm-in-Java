package dyanamicProgramming;

public class LongestSubsequenceMemoization {
	
	int lcsa( String X, String Y, int m, int n ) 
	  { 
	    int mimo[][] = new int[m+1][n+1]; 
	  
	    /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
	         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	    for (int i=0; i<=m; i++) { 
	      for (int j=0; j<=n; j++) { 
	    	  mimo[i][j] = -1;
	    	  }
	      }
	    
	    for (int i=0; i<=m; i++) 
	    { 
	      for (int j=0; j<=n; j++) 
	      { 
	    	  if(mimo[m][n] != -1)
	    		  return mimo[m][n];
	    	  if (m == 0 || n == 0) 
	    		  mimo[m][n] = 0; 
	          else{
	        	  if(X.charAt(i-1) == Y.charAt(j-1)) 
	        		  mimo[m][n] = 1+ lcsa(X,Y,m-1,n-1);
	              else
	                  mimo[m][n] = Math.max(lcsa(X,Y,m-1,n),(lcsa(X,Y,m,n-1))); 
	        	  }
	    	  }
	      }
	    return mimo[m][n]; 
	    } 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
