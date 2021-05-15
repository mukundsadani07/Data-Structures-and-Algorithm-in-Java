package sorting;

public class QuickSortAlgorithm {
	void qSort(int arr[],int l, int h) {
		if(l<h) {
			int p = lPartition(arr,l,h);
			qSort(arr,l,p-1);
			qSort(arr,p+1,h);
			
		}
	}
	
	//Lomuto Partition
	int lPartition(int arr[], int l, int h) {
		int pivot = arr[h];
		int i=l-1;
		for(int j=l;j<=h-1;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		//swap
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
