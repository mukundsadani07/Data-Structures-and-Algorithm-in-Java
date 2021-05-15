package circularLinkedList;

public class InsertAtEnd2 {
	Node insertEnd(Node head,int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			temp.next = head.next;
			head.next = temp;
			int t = temp.data;
			temp.data = head.data;
			head.data = t;
			return temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
