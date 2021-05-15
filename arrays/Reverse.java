package arrays;

public class Reverse {
	void reversing(int arr[]) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
