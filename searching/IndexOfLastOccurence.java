package searching;

public class IndexOfLastOccurence {
	static int LastOcc(int[] arr,int x) {
		int n = arr.length;
		for(int i=n-1;i>=0;i--) {
			if(arr[i] == x)
				return i;
		}return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,15,20,20,40,40};
		int k = LastOcc(arr,40);
		System.out.println(k);
	}

}
