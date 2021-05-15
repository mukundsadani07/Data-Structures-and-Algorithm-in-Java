package sorting;

public class IntersectionOf2SortedArrays {
	void intersection(int[] a,int[] b) {
		int m = a.length;
		int n = b.length; 
		for(int i=0;i<m;i++) {
			if(i>0 && a[i-1] == a[i])
				continue;    
			for(int j=0;j<n;j++) {
				if(a[i] == b[j]) {
					System.out.println(a[i]+" ");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
