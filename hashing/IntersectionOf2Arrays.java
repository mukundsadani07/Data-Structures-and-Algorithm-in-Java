package hashing;

public class IntersectionOf2Arrays {
	static int intersectionArr(int[] a,int[] b) {
		int m = a.length;
		int n = b.length;
		int count = 0; 
		for(int i=0;i<m;i++) {
			boolean flag = false;
			for(int j=0;j<i-1;j++) {
				if(a[j] == a[i]) {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				continue;
			}
			for(int j=0;j<n;j++) {
				if(a[i] == b[j]) {
					count++;
					break;
				}
			}
		}return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,15,20,15,30,30,5};
		int[] b = {30,5,30,80};
		System.out.println(intersectionArr(a,b));
		
	}
}
