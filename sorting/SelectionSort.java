package sorting;

public class SelectionSort {
	static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min_idx = i;
			for(int j=i+1;j<n;j++) {
				if(arr[min_idx]>arr[j]) {
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		 selectionSort(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}
