package circularLinkedList;

public class Traversal2 {
	void printList(Node head) {
		if(head == null) return;
		Node r = head;
		do {
			System.out.println(r.data+" ");
			r = r.next;
		}while(r!=head);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
