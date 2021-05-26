package sorting;

public class LometuPartition {
	int lPartition(int[] arr, int l, int h) {
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
