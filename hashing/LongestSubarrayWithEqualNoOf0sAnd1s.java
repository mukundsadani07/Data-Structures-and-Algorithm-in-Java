package hashing;

public class LongestSubarrayWithEqualNoOf0sAnd1s {
	static int longestSubarray(int[] arr) {
		int n = arr.length;
		int res = 0;
		for(int i=0;i<n;i++) {
			int oneS=0,zeroS=0;
			for(int j=i;j<n;j++) {
				if(arr[j] == 1) {
					oneS++;
				}
				if(arr[j] == 0){
					zeroS++;
				}
				if(zeroS == oneS) {
					res = Math.max(res, j-i+1);
				}
			}
		}return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,1,1,0};
		System.out.println(longestSubarray(arr));
	}
}
