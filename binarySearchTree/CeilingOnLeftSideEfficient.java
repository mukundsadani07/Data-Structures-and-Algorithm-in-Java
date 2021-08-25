package binarySearchTree;

import java.util.TreeSet;

public class CeilingOnLeftSideEfficient {
	//O(nlog(n))
	static void ceiling(int[] arr) {
		int n = arr.length;
		TreeSet<Integer> t = new TreeSet<>();
		for(int i=0;i<n;i++) {
			Integer c = t.ceiling(arr[i]);
			if(c == null)
				System.out.print(-1+" ");
			else
				System.out.print(c+" ");
			t.add(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,30,15,25,12};
//		int[] arr = {10,10,10};
		ceiling(arr);
	}
}
