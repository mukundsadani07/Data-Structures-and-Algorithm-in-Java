package arrays;

//Given an unsorted array of non-negative integers. Find if there is a subarray with given sum.

public class WindowSlidingTechnique2 {
	
	//O(n^2)
//	boolean subArray(int[] arr,int n,int givenSum) {
//		for(int i=0;i<n;i++) {
//			int sum = 0;
//			for(int j=i;j<n;j++) {
//				sum += arr[i];
//				if(sum == givenSum)
//					return true;
//			}
//		}
//		return false;
//	}
	
	//O(n)
	boolean subArray(int[] arr,int n,int sum) {
		//s = start
		//e = end
		int curr_sum = arr[0], s=0;
		for(int e=1;e<n;e++) {
			//Clean the previous window
			while(curr_sum>sum && s<e-1) {
				curr_sum -=arr[s];
				s++;
			}
			if(curr_sum == sum)
				return true;
			if(e<n)
				curr_sum +=arr[e];
		}
		return (curr_sum ==sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
