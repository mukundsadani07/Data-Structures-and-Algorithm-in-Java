package doublyLinkedList;

public class DeleteLastNode {
	Node deleteLastNode(Node head) {
		if(head == null || head.next == null)return null;
		else {
			Node curr = head;
			while(curr.next !=null) {
				curr = curr.next;
			}
			curr.prev.next = null;
			return head;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
