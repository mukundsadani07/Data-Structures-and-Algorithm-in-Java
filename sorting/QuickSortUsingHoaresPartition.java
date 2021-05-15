package sorting;

public class QuickSortUsingHoaresPartition {
	
	void qSort(int arr[],int l, int h) {
		if(l<h) {
			int p = partition(arr,l,h);
			qSort(arr,l,p);
			qSort(arr,p+1,h);
			
		}
	}
	
	
	int partition(int arr[],int l,int h) {
		int pivot = arr[l];
		int i=l-1, j=h+1;
		while(true) {
			
			do {
				i++;
			}while(arr[i]<pivot);
			
			do {
				j--;
			}while(arr[j]>pivot);
			
			if(i>=j)
				return j;
			//swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
