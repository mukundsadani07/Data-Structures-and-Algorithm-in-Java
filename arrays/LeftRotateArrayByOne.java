package arrays;

public class LeftRotateArrayByOne {
	void leftRotate(int arr[]) {
		int n = arr.length;
		int temp = arr[0];
		for(int i=1;i<n;i++)
			arr[i-1] = arr[i];
		arr[n-1] = temp;
//		int temp=0;
//		for(int i=1;i<n;i++) {
//			temp = arr[i-1];
//			arr[i-1] = arr[i];
//			arr[i] = temp;
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
