package arrays;

public class RightRotateAnArrayByk {
	static int[] rightRotate(int[] arr,int k) {
		int n = arr.length;
		if(n==0 || n==1) {
			return arr;
		}
		if (k > n)
            k = k % n;

        int[] ans = new int[n];

        for (int i = 0; i < k; i++) {
            ans[i] = arr[n - k + i];
        }

        int index = 0;
        for (int i = k; i < n; i++) {
            ans[i] = arr[index++];
        }
        return ans;

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int k = 2;
		int[] res = rightRotate(arr,k);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
