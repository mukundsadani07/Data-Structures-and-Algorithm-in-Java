package sorting;

public class CountInversionInArrayEfficient {
	static int countInv(int[] arr,int l,int r) {
		int res = 0;
		if(l<r) {
			int m = l+(r-l)/2;
			res += countInv(arr,l,m);
			res += countInv(arr,m+1,r);
			res += countAndMerge(arr,l,m,r);
		}
		return res;
	}
	static int countAndMerge(int[] arr,int l,int m,int r) {
		int n1 = m-l+1, n2 = r-m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i] = arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			right[i] = arr[m+1+i];
		}
		int res = 0,i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[i]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
				res +=n1-i; //difficult part to understand
			}
			k++;
		}
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = right[i];
			j++;
			k++;
		}return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {2,4,1,3,5};
//		int[] arr = {10,20,30,40};
		int[] arr = {40,30,20,10};
		int n = arr.length;
		int l = 0;
		int r = n-1;
		System.out.println(countInv(arr,l,r));
	}

}
