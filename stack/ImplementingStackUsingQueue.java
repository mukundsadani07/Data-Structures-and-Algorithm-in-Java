package stack;
import java.util.*;

class StackQ{
	static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    
    static int curr_size;
    StackQ(){
    	curr_size = 0;
    }
    
    static int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    static int size()
    {
        return curr_size;
    }
    
    static void push(int x) {
    	curr_size++;
    	  
        // Push x first in empty q2
        q2.add(x);

        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    
    int pop() {
    	if (q1.isEmpty())
            return -1;
    	int x = q1.peek();
        q1.remove();
        curr_size--;
        return x;
    }
}

public class ImplementingStackUsingQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
