package sorting;

public class CountingSort {
	void countSort(int arr[],int n,int k) {
		int count[] = new int[k];
		for(int i=0;i<k;i++) {
			count[i] = 0;
		}
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		int index = 0;
		for(int i=0;i<k;k++) {
			for(int j=0;j<count[i];j++) {
				arr[index] = i;
				index++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
