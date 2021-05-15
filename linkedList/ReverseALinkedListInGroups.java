package linkedList;

public class ReverseALinkedListInGroups {
	static Node reverseInGrps(Node head,int x) {
		Node curr = head;
		Node next = null,prev = null;
		int count = 0;
		while(curr!=null && count<x) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next!=null) {
			Node rest_head = reverseInGrps(next,x);
			head.next = rest_head;
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
