package hashing;

public class CountDistinctElements {
	static int countDistinct(int[] arr) {
		int res = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			boolean flag = false;
			for(int j=i-1;j>=0;j--) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,12,13,12,13,13,18};
//		int[] arr = {10,10,10};
		int p = countDistinct(arr);
		System.out.println(p);
	}
}
