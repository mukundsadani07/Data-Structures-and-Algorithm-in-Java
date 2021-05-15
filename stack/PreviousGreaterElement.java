package stack;

public class PreviousGreaterElement {
	static void previousGreater(int[] arr) {
		int n = arr.length;
		System.out.print(-1+" ");
		for(int i=1;i<n;i++) {
			int res = -1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]<arr[j]) {
					res = arr[i];
					System.out.print(res+" ");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,10,12};
		previousGreater(arr);
	}
}
