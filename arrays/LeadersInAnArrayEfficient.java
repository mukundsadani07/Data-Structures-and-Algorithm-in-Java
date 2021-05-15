package arrays;

public class LeadersInAnArrayEfficient {
	static void leader(int arr[],int n) {
		 int curr_ldr = arr[n-1];
		 System.out.print(curr_ldr+" ");
		 for(int i=n-2;i>=0;i--) {
			 if(curr_ldr < arr[i]) {
				 curr_ldr = arr[i];
				 System.out.print(curr_ldr+" ");
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
