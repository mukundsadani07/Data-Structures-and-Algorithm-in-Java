package searching;

public class SearchInAnInfiniteSortedArrayEfficient {
	//Unbounded Binary Search
	//O(log(position))
	static int search(int[] arr,int x) {
		if(arr[0] == x)
			return 0;
		int i=1;
		while(arr[i]<x) {
			i*=2;
			if(arr[i] == x)
				return i;
		}
//		return binarySearch(arr,x,i/2+1,i-1);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
