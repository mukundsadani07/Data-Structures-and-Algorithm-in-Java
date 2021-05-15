package sorting;

public class Merge2SortedArraysEfficient {
	void merge(int a[], int b[],int m,int n) {
		int i=0,j=0;
		while(i<m && j<n) {
			if(a[i]<b[j]) {
				 System.out.println(a[i]);
				 i++;
			}else {
				System.out.println(b[j]);
				j++;
			}
			//printing remaining elements
			while(i<m) {
				System.out.println(a[i]);
				i++;
			}while(j<n) {
				System.out.println(b[j]);
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
