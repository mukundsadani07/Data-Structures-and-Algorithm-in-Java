package stack;
import java.util.Stack;

public class StockSpanProblemEfficient {
	static void stockSpan(int[] arr) {
		int n = arr.length;
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		System.out.print(1+" ");
		for(int i=1;i<n;i++) {
			while(!s.empty() && arr[s.peek()]<=arr[i]) {
				s.pop();
			}
			int span = (s.empty())?(i+1):(i-s.peek());
			System.out.print(span+" ");
			s.push(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,13,12,14,16,8,6,4,10,30};
		stockSpan(arr);
	}
}
