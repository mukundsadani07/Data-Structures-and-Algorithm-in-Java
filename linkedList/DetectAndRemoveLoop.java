package linkedList;

public class DetectAndRemoveLoop {
	static void DetectRem(Node head) {
		
		    //Loop detection logic
			Node slow_p = head,fast_p = head;
			while(fast_p!=null && fast_p.next!=null) {
				slow_p = slow_p.next;
				fast_p = fast_p.next.next;
				if(slow_p == fast_p)
					break;
			}
			if(slow_p!=fast_p)
				return;
			
			//Loop Removal Logic
			slow_p = head;
			while(slow_p.next!=fast_p.next) {
				slow_p = slow_p.next;
				fast_p = fast_p.next;
			}
			fast_p.next = null;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
