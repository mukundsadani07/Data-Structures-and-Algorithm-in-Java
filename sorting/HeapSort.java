package sorting;

public class HeapSort {
	void buildHeap(int arr[], int n) {
		for(int i=(n-2)/2;i>=0;i--) {  // for(int i=n/2-1;i>=0;i--){
			maxHeapify(arr,n,i);                                                                                                                                         
		}
	}
	
	void maxHeapify(int arr[],int n,int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]>arr[largest]) largest = left;
			if(right<n && arr[right]>arr[largest]) largest = right;
				if(largest !=i) {
					//swap
					int temp = arr[largest];
					arr[largest] = arr[i];
					arr[i] = temp;
					
					maxHeapify(arr,n, largest);
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
