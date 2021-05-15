package arrays;

public class MoveAllZerosToEndEfficient {
	void moveZeros(int arr[]) {
		int n=arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				//swap
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
