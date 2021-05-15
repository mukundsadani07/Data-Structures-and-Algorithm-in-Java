package sorting;

public class KthSmallestElementEfficient {
	static int kth(int[] arr,int k) {
		int n = arr.length;
		int l = 0,r=n-1;
		int mid;
		while(l<=r) {
			 mid = l + (r-l)/2;
			int p = partition(arr,l,r);
			if(p == k-1)
				return arr[p];
			else if(p>k-1) 
				r = p-1;
			else
				l = p+1; 
		}
		return -1;
	}
	static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i=l-1;
		for(int j=l;j<=h-1;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		//swap
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,30,12};
		System.out.println(kth(arr,2));
	}

}
