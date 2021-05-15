package doublyLinkedList;

public class InsertAtEndOfDll {
	
	static Node insertEnd(Node head,int data) {
		Node temp = new Node(data);
		if(head == null)return temp;
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertEnd(head,10);
		head = insertEnd(head,20);
	}

}
