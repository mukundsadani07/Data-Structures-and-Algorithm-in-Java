package stack;
import java.util.*;

class StackQ{
	static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    
    static int curr_size;
    StackQ(){
    	curr_size = 0;
    }
    
    int top() {
    	return q1.peek();
    }
    
    void push(int x) {
    	while(q1.isEmpty() == false) {
    		q2.add(q1.peek());
    		q1.remove();
    	}
    }
}

public class ImplementingStackUsingQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
