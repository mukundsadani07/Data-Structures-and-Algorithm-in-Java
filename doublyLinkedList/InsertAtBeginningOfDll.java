package doublyLinkedList;

class Node{
	int data;
	Node prev;
	Node next;
	Node(int d){
		data = d;
		next = prev = null;
	}
}

public class InsertAtBeginningOfDll {
	
	public static Node insertBegin(Node head, int data) {
		Node temp = new Node(data);
		temp.next = head;
		if(head!=null)
			head.prev = temp;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
