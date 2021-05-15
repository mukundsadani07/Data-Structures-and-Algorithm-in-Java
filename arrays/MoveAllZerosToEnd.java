package arrays;

public class MoveAllZerosToEnd {
	void moveZerosToEnd(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i] == 0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]!=0) {
						//swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
