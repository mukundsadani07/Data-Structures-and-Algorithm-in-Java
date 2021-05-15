package circularLinkedList;

public class InsertAtBeginning {
	Node insertBegin(Node head,int x) {
		Node temp = new Node(x);
		if(head == null)
			temp.next = temp;
		else {
			Node curr = head;
			while(curr!=head)
				curr = curr.next;
			curr.next = temp;
			temp.next = head;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
