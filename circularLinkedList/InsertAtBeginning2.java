package circularLinkedList;

public class InsertAtBeginning2 {
	Node insertBegin(Node head,int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return head;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
