package arrays;

public class RemoveDuplicatesFromASortedArrayEfficient {
	static int remove(int[] arr) {
		int n = arr.length;
		int res = 1;
		for(int i=1;i<n;i++) {
			if(arr[res-1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,20,30,30,30,30};
//		int arr[] = {10,10,10};
		System.out.println(remove(arr));
	}
}
