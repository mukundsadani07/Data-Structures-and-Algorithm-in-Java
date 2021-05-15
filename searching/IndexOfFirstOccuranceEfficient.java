package searching;

public class IndexOfFirstOccuranceEfficient {
//	static int firstOcc(int[] arr,int l,int h, int x) {
//		if(l>h)
//			return -1;
//		int mid = l+(h-l)/2;
//		if(x>arr[mid])
//			return firstOcc(arr,mid+1,h,x);
//		else if(x<arr[mid])
//			return firstOcc(arr,l,mid-1,x);
//		else {
//			if(mid == 0 || arr[mid-1]!=arr[mid]) {
//				return mid;
//			}else
//				return firstOcc(arr,l,mid-1,x);
//		} 
//	}
	
	static int firstOcc(int[] arr,int l,int h, int x) {
		while(h>=l) {
		int mid = l+(h-l)/2;
		if(x>arr[mid])
			l = mid+1;
		else if(x<arr[mid])
			h = mid-1;
		else {
			if(mid == 0 || arr[mid-1]!=arr[mid]) {
				return mid;
			}else
				h=mid-1;
			} 
		}return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,10,10,15,20,20,20};
		int k = firstOcc(arr,0,arr.length-1,20);
		System.out.println(k);
	}
}
