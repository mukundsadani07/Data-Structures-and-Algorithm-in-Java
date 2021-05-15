package doublyLinkedList;

public class CircularDoublyLinkedList {
	Node insertAtHead(Node head, int x) {
	Node temp = new Node(x);
	if(head == null) {
		temp.next = temp;
		temp.prev = temp;
		return temp;
	}
	temp.prev = head.prev;
	temp.next = head;
	temp.prev.next = temp;
	temp.prev = temp;
	return temp;
	}
	
	Node insertAtEnd(Node head,int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
		temp.prev = head.prev;
		temp.next = head;
		temp.prev.next = temp;
		temp.prev = temp;
		return head;
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
