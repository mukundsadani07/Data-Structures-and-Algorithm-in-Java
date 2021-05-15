package circularLinkedList;

public class InsertAtEnd {
	Node insertEnd(Node head,int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else {
			Node curr = head;
			while(curr!=head) 
				curr = curr.next;
			curr.next = temp;
			temp.next = head;
			return head;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
