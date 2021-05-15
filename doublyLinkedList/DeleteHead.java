package doublyLinkedList;

public class DeleteHead {
	
	Node deleteHead(Node head) {
		if(head == null) return null;
		if(head.next == null)return null;
		else {
			head = head.next;
			head.prev = null;
			return head;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
