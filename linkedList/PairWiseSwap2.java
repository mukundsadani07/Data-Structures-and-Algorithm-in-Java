package linkedList;

public class PairWiseSwap2 {
	static Node pairwise(Node head) {
		if(head == null || head.next == null)
			return head;
		Node curr = head.next.next;
		Node prev = head;
		
		head = head.next;
		head.next = prev;
		
		while(curr!=null && curr.next!=null) {
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = curr;
			curr = next;
		}
		prev.next =curr;
		return head;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
