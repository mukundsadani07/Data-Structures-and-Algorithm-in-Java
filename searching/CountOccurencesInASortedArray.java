package searching;

public class CountOccurencesInASortedArray {
	//O(n) solution
//	static int countOcc(int[] arr,int x) {
//		int n = arr.length;
//		int count = 0;
//		for(int i=0;i<n;i++) {
//			if(arr[i] == x) {
//				count++;
//			}
//		}
//		return count;
//	}
	
	//O(log(n)) solution
	static int countOcc(int[] arr,int x) {
		int n = arr.length;
		int first = firstOcc(arr,x);
		if(first == -1)
			return 0;
		else
			return (lastOcc(arr,x)-first+1);
	}
	
	static int firstOcc(int[] arr, int x) {
		int n = arr.length;
		int l = 0,h=n-1;
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
	
	static int lastOcc(int[] arr,int x) {
		int n = arr.length;
		int l = 0,h=n-1;
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
		int[] arr = {10,15,20,20,20,40,40};
		int k = countOcc(arr,20);
		System.out.println(k);
	}
}
