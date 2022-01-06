package stack;
import java.util.Stack;
public class NextGreaterElement {
	public static void nextGreater(int[] arr,int n) {
		int[] res = new int[n];
		res[n-1] = -1;
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[n-1]);
		for(int i=n-2;i>=0;i--) {
			while(!s.isEmpty() && s.peek()<=arr[i]) {
				s.pop();
			}
			int nextGreater = s.isEmpty()?-1:s.peek();
			res[i] = nextGreater;
			s.push(arr[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,4};
		int n = arr.length;
		nextGreater(arr,n);
	}
}
