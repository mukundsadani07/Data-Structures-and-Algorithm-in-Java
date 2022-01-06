package linkedList;

public class DetectLoopFloydCycleDetection {
	boolean isLoop(Node head) {
		Node slow_p = head,fast_p = head;
		while(fast_p!=null && fast_p.next!=null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p) {
				return true;
			}
		}return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
