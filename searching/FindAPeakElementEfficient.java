package searching;

public class FindAPeakElementEfficient {
	static int findPeak(int[] arr) {
		int n = arr.length;
		int l = 0,h = n-1;
		while(h>=l) {
			int mid = l+(h-l)/2;
			if((mid == 0 || arr[mid]>=arr[mid-1]) && (mid == n-1 || arr[mid]>= arr[mid+1])) {
				return arr[mid];
			}
			if(mid>0 && arr[mid]<=arr[mid-1])
				h = mid-1;
			else
				l = mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {80,70,90};
		int[] arr = {5,10,20,15,7};
		System.out.println(findPeak(arr));
	}
}
