package arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromASortedArray {
	static int remove(int[] arr) {
//		HashSet<Integer> h = new HashSet<>();
//		for(int i=0;i<arr.length;i++) {
//			h.add(arr[i]);
//		}
//		return h.size();
//		if(arr.length == 0)
//			return 0;
//		int count = 1;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]!=arr[i-1])
//				count++;
//		}
//		return count;
		int n = arr.length;
		int[] temp = new int[n];
		temp[0] = arr[0];
		int res = 1;
		for(int i=1;i<n;i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res] = arr[i];
			    res++;
			}
		}
		for(int i=0;i<res;i++) {
			arr[i] = temp[i];
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,20,30,30,30,30};
		System.out.println(remove(arr));
	}
}
