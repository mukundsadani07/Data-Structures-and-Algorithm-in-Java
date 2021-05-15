package searching;

public class FindPairWithAGivenSumInASortedArray {
	static boolean isPair(int[] arr,int x) {
		int n = arr.length;
		int l = 0,r=n-1;
		while(l<r) {
			if(arr[l]+arr[r] == x) {
				return true;
			}
			else if(arr[l]+arr[r]<x) {
				l++;
			}else {
				r--;
			}
		}return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,8,9,20,40};
		System.out.println(isPair(arr,5));
	}
}
