package linkedList;

public class MiddleElementEfficientSolution {
	void printMiddle(Node head) {
		if(head == null)return;
		Node slow = head, fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
