package deque;
import java.util.*;


public class DataStructuresWithMinMaxOperations {

	Deque<Integer> dq;
	DataStructuresWithMinMaxOperations(){
		dq = new LinkedList<Integer>();
	}
		void insertMin(Integer x) {
			dq.offerFirst(x);
		}
		void insertMax(Integer x) {
			dq.offerLast(x);
		}
	int getMin() {return dq.peekFirst();}
	int getMax() {return dq.peekLast();}
	int extractMin() {return dq.pollFirst();}
	int extractMax() {return dq.pollLast();}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
