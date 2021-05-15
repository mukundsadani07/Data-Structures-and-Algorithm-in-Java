package searching;

public class SearchInASortedRotatedArray {
	static int search(int[] arr,int x) {
		int n = arr.length;
		int l=0,h=n-1;
		while(h>=l) {
			int mid = l+(h-l)/2;
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid]>arr[l]) {
				if(x>=arr[l] && x<arr[mid])
					h = mid-1;
				else
					l=mid+1;
			}else {
				if(x>arr[mid] && x<=arr[h])
					l = mid+1;
				else
					h = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,40,60,5,8};
		System.out.println(search(arr,5));
	}
}



