package circularLinkedList;

public class DeleteHead {
	Node deleteHead(Node head){
		if(head == null)
			return null;
		if(head.next == null)
			return null;
		else {
			Node curr = head;
			while(curr!=head)
				curr = curr.next;
			curr.next = head.next;
			return curr.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
