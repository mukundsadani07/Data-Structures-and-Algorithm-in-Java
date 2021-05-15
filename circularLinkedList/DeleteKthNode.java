package circularLinkedList;

public class DeleteKthNode {
	Node deleteKthNode(Node head,int k) {
		if(head == null) return head;
		if(head.next == null)return null;
		else {
			Node curr = head;
			for(int i=0;i<k-2;i++) {
				curr=curr.next;
				}
			curr.next = curr.next.next;
			return head;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
