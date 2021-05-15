package bitmagic;

public class OddOccurringNumber2 {
	static int findOdd(int[] arr,int n) {
		int res = 0;
		for(int i=0;i<n;i++) 
			res = res^arr[i];
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
