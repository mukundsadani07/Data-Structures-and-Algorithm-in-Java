package hashing;

public class CountFrequenciesOfArrayElements {

	static void printFreq(int arr[], int n) {
		for(int i=0;i<n;i++) {
			boolean flag = false;
			for(int j=i-1;j>=0;j--) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==true) continue;
			int freq = 1;
			for(int j=i+1;j<n;j++) {
				if(arr[j] == arr[i])
					freq++;
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,1,7,4,2,9};
		int n = arr.length;
		printFreq(arr,n);
	}
}
