package sorting;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swapped = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			//If the "if" condition didn't execute it means the array has been sorted so we need to break out of the loop
			if(!swapped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		 bubbleSort(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}
