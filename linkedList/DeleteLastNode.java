package linkedList;

public class DeleteLastNode {
	Node delTail(Node head) {
		if(head == null)
			return null;
		if (head.next == null)
			return null;
		Node curr = head;
		while(curr.next.next !=null)
			curr = curr.next;
		curr.next = null;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
