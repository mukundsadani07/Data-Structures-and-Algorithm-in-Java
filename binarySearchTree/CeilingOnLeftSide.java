package binarySearchTree;

public class CeilingOnLeftSide {
	//O(n^2)
	static void ceiling(int arr[]) {
		int n = arr.length;
		System.out.print(-1+" ");
		for(int i=1;i<n;i++) {
			int ans = Integer.MAX_VALUE;
			for(int j=0;j<i;j++) {
				if(arr[j]>=arr[i])
					ans = Math.min(arr[j], ans);
			}
			if(ans == Integer.MAX_VALUE)
				System.out.print(-1+" ");
			else
				System.out.print(ans+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {2,8,30,15,25,12};
		int[] arr = {10,10,10};
		ceiling(arr);
	}
}
