package searching;

public class FindTripletWithAGivenSumInASortedArray {
	static boolean triplet(int[] arr, int x) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(isPair(arr,i+1,n-1,x-arr[i]))
				return true;
		}
		return false;
	}
	static boolean isPair(int[] arr,int l,int r, int x) {
		int n = arr.length;
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
		System.out.println(triplet(arr,32));
	}
}
