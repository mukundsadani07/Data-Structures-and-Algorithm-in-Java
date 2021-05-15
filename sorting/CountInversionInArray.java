package sorting;

public class CountInversionInArray {
	static void countInversion(int[] arr,int n) {
		int ans = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {2,4,1,3,5};
//		int[] arr = {10,20,30,40};
		int[] arr = {40,30,20,10};
		int n = arr.length;
		countInversion(arr,n);
	}

}
