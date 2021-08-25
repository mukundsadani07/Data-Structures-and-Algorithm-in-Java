package dyanamicProgramming;

public class LongestCommonSubsequenceRecursive {
	static int lcs(String s1,String s2,int m,int n) {
		if(m==0 || n==0)
			return 0;
		if( s1.charAt(m-1) == s2.charAt(n-1))
			return 1+lcs(s1,s2,m-1,n-1);
		else {
			return Math.max(lcs(s1,s2,m,n-1),lcs(s1,s2,m-1,n));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "AXYZ";
		String Y = "BAZ";
		int m = X.length();
		int n = Y.length();
		System.out.println(lcs(X,Y,m,n));
	}

}
