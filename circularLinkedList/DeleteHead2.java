package circularLinkedList;

public class DeleteHead2 {
	Node deleteHead(Node head) {
		if(head == null)return null;
		if(head.next == null) return null;
		else {
			head.data = head.next.data;
			head.next = head.next.next; 
			return head;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
