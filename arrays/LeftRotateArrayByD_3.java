package arrays;

public class LeftRotateArrayByD_3 {
	void leftRotate(int[] arr,int n,int d) {
		//d = no of rotations
		//n = length of arr
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		
	}
	void reverse(int[] arr,int low,int high) {
		while(low<high) {
			//swap
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			high--;
			low++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
