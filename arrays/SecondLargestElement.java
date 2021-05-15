package arrays;

public class SecondLargestElement {
	
	int getLargest(int arr[],int n) {
		int largest = 0;
		for(int i=1;i<n;i++)
			if(arr[i]>arr[largest])
				largest = i;
		return largest;
	}	
	int SecondLargest(int arr[],int n) {
		int largest = getLargest(arr,n);
		int res = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[largest]) {
				if(res == -1)
					res = i;
				else if(arr[i]>arr[res])
					res = i;
			} 
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
