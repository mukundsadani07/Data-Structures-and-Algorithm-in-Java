package sorting;

import java.util.Arrays;

public class Merge2SortedArrays {
	 void merge(int a[],int b[],int m, int n) {
		int c[] = new int[m+n];
		for(int i=0;i<m;i++) {
			c[i] = a[i];
		}
		for(int j=0;j<m;j++) {
			c[j+m] = b[j];
		}
		Arrays.sort(c);
		for(int i=0;i<m+n;i++) {
			System.out.println(c[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
