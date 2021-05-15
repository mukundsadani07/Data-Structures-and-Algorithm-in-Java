package arrays;

public class LargestElementEfficient {
	 int getLargest(int arr[]) {
		int n= arr.length;
		int res = 0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[res]) {
				res = i;
			}
		}return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
