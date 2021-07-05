package heap;

import java.util.Arrays;

public class PurchasingMaximumItem {
	//O(nlog(n))
	//Aux Space: O(1)
	static int maxItem(int[] arr,int sum) {
		int ans = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(sum>arr[i]) {
				sum-=arr[i];
				ans+=1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
	 // TODO Auto-generated method stub
		int arr[] = {1,5,12,111,200};
		int p = maxItem(arr,10);
		System.out.println(p);
	}
}
