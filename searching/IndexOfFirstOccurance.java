package searching;

public class IndexOfFirstOccurance {
	static int firstOcc(int[] arr,int k) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i] == k) {
				return i;
			}
		}return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,10,10,10,20,20,40};
		int k = firstOcc(arr,20);
		System.out.println(k);
	}
}
