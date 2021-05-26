package hashing;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInTwoBinaryArraysEfficient {
	static int commonSpan(int[] arr1,int[] arr2) {
		int n1 =arr1.length;
		int n2 = arr2.length;
		int res = 0;
		int x = Math.max(n1, n2);
		int[] temp = new int[x];
		
		HashMap<Integer,Integer> m = new HashMap<>();
		int sum=0;

		for(int i=0;i<x;i++) {
			temp[i] = arr1[i] - arr2[i];
			sum+= temp[i];
			if(sum == 0) {
				res = i+1;
			}
			if(!m.containsKey(sum)) {
				m.put(sum, i);
			}
			if(m.get(sum)!=null) {
				res = Math.max(res, i-m.get(sum));
			}
				
		}return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {0,1,0,0,0,0};
		int[] arr2 = {1,0,1,0,0,1}; 
//		int[] arr1 = {0,1};
//		int[] arr2 = {1,0};
		System.out.println(commonSpan(arr1,arr2));
	}
}
