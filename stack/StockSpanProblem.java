package stack;

public class StockSpanProblem {
	static void stockSpan(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int span = 1;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<=arr[i])
					span++;
				else
					break;
			}
			System.out.print(span+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,13,12,14,16,8,6,4,10,30};
		stockSpan(arr);
	}
}
