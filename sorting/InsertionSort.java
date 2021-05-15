package sorting;

public class InsertionSort {
	void iSort(int arr[], int n) {
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			} 
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
