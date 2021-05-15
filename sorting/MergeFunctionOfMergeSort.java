package sorting;

public class MergeFunctionOfMergeSort {
	void merge(int arr[],int l,int m,int h) {
		int n1 = m-l+1; 
		int n2= h-m; 
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i=0;i<n1;i++) 
			left[i] = arr[l+i];
		for(int j=0;j<n2;j++)
			right[j] = arr[m+1+j];
		
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) { // = sign ensures stability of algorithm 
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}
		}
		//For adding remaining elements
		while(i<n1)
			arr[k++] = left[i++];
		while(j<n2)
			arr[k++] = right[j++];
	} //End of function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
