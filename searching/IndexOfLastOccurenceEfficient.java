package searching;

public class IndexOfLastOccurenceEfficient {
	//recursive Solution
//	static int lastOcc(int[] arr,int l,int h,int x) {
//		int n = arr.length;
//		if(l>h)
//			return -1;
//		int mid = l+(h-l)/2;
//		if(x<arr[mid]) {
//			return lastOcc(arr,l,mid-1,x);
//		}else if(x>arr[mid]) {
//			return lastOcc(arr,mid+1,h,x);
//		}else {
//			if(mid == n-1 || arr[mid]!=arr[mid+1] )
//				return mid;
//			else
//				return lastOcc(arr,mid+1,h,x);
//		}
//	}
	
	//Iterative Solution
	static int lastOcc(int[] arr,int l,int h,int x) {
		int n = arr.length;
		while(h>=l) {
		int mid = l+(h-l)/2;
		if(x<arr[mid]) {
			h=mid-1;
		}else if(x>arr[mid]) {
			l=mid+1;
		}else {
			if(mid == n-1 || arr[mid]!=arr[mid+1] )
				return mid;
			else
				return h = mid+1;
			}
		}return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,15,20,20,40,40};
		int k = lastOcc(arr,0,arr.length-1,60);
		System.out.println(k);
	}
}
