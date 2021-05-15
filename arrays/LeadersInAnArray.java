package arrays;

public class LeadersInAnArray {
	static void leader(int arr[],int n) {
		for(int i=0;i<n;i++) {
			boolean flag = false;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10,4,3,6,5,2};
		int n = arr.length;
		leader(arr,n);
	}

}
