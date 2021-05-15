package sorting;

public class IntersectionOf2SortedArraysEfficient {
	void intersection(int[] a,int[] b) {
		int m = a.length;
		int n = b.length;
		int i=0,j=0;
		while(i<n && j<m) {
			if(i>0 && a[i-1] == a[i]) {
				i++;
				continue;
			}
			if(a[i]<b[j]) {
				i++;
			}
			else if(a[i]>b[j]) {
				j++;
			}
			  else {
				System.out.println(a[i]+" ");
				i++;
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
