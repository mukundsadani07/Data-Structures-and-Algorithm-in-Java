package sorting;

public class PartitionAGivenArray {
	void partition(int arr[],int l,int h, int p) {
		int temp[] = new int[h-l+1];
		int index = 0;
		
		//Less than pivot elements
		for(int i=l;i<=h;i++) {
			if(arr[i]<=arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		//greater than pivot elements
		for(int i=l;i<=h;i++)
			if(arr[i]>arr[p]) {
				temp[index] = arr[i];
				index++;
		}
		
		//copying partitioned arrays content into original array
		for(int i=l;i<=h;i++) {
			arr[i] = temp[i-l];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
