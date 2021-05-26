package hashing;

public class SubarrayWithGivenSum {
	static boolean givenSum(int[] arr,int x) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum+= arr[j];
				if(sum == x) {
					return true;
				}
			}
		}return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,6,13,3,-1};
		System.out.println(givenSum(arr,22));
	}
}
