package hashing;

public class UnionOf2UnsortedArray {
	static int unionOf2(int[] a,int[] b) {
		int m = a.length;
		int n = b.length;
		int[] c = new int[m+n];
		for(int i=0;i<m;i++) {
			c[i] = a[i];
		}
		for(int i=0;i<n;i++) {
			c[i+m] = b[i];
		}
		int res = 0;
		for(int i=0;i<m+n;i++) {
			boolean flag = false;
			for(int j=0;j<i;j++) {
				if(c[i] == c[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {15,20,5,15};
		int[] arr2 = {15,15,15,20,10};
		System.out.println(unionOf2(arr1,arr2));
	}
}
