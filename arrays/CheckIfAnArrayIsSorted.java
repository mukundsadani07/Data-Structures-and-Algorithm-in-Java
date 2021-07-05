package arrays;

public class CheckIfAnArrayIsSorted {
	static boolean isSorted(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,20,30,10};
		System.out.println(isSorted(arr));
	}
}
