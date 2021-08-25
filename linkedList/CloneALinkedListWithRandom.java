package linkedList;

public class CloneALinkedListWithRandom {
	static void clone(Node head) {
		if(head == null)
			return;
		
		Node curr = head;
		Node head2 = new Node(head.data);
		while(curr!=null) {
			head2.next = new Node(curr.next.data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
