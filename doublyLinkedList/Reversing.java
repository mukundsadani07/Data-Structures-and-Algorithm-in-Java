package doublyLinkedList;

public class Reversing {
	Node reverseDLL(Node head) {
		if(head == null || head.next == null)return head;
		Node prev = null; 
		Node curr = head;
		if(curr!=null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.next;
		} 
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
