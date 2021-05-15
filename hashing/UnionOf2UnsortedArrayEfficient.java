package hashing;

import java.util.HashSet;

public class UnionOf2UnsortedArrayEfficient {
	static int union(int[] a,int[] b) {
		int m = a.length;
		int n = b.length;
		HashSet<Integer> h = new HashSet<>();
		
		for(int i=0;i<m;i++) {
			h.add(a[i]);
		}
		for(int i=0;i<n;i++) {
			h.add(b[i]);	
		}
		return h.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {15,20,5,15};
		int[] arr2 = {15,15,15,20,10};
		System.out.println(union(arr1,arr2));
	}
}
