package dyanamicProgramming;

import java.util.*;
public class FibonacciMemoization {
	
	//Simple Recursive solution
//	int fib(int n) {
//		if(n==0 || n==1)
//			return n;
//		else
//			return fib(n-1) + fib(n-3);
//	}
	
	//memoization 
	static int fibo(int n) {
		int[] memo = new int[n+1];
		for(int i=0;i<n+1;i++) {
			memo[i] = -1;
		}
		//or Arrays.fill(memo,-1);
		if(memo[n] == -1) {
			int res;
			if(n==0 || n==1)
				res = n;
			else
				res = fibo(n-1)+fibo(n-2);
			memo[n] = res;
		}
		return memo[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(6));
	}
}
