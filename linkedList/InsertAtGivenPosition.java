package linkedList;

public class InsertAtGivenPosition {
	Node InsertPos(Node head, int pos, int data) {
		 Node temp = new Node(data);
		 if(pos==1) {
			 temp.next = head;
			 return temp;
		 }
		 Node curr = head;
		 for(int i=1;i<=pos-2 && curr!=null;i++) 
			 curr = curr.next;
		 //corner case if position beyond the size of the linked list
		 if(curr == null)
			 return head;
		 temp.next = curr.next;
		 curr.next = temp;
		 return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
