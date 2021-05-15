package sorting;

import java.util.Arrays;

public class UnionOf2SortedArrays {
	static void union(int[] a,int[] b){
		int m = a.length;
		int n = b.length;
		int c[] = new int[m+n];
		for(int i=0;i<m;i++) {
			c[i] = a[i];
		}
		for(int i=0;i<n;i++) {
			c[m+i] = b[i];
		}
		
		Arrays.sort(c);
		
		for(int i=0;i<m+n;i++) {
			if(i == 0 || c[i] != c[i-1] ) {
				System.out.print(c[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,8,10};
		int[] b = {2,3,8,9,10,15};
		union(a,b);
	}

}
