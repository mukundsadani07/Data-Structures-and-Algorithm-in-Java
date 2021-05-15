package linkedList;

public class SortedInsert {
	Node sortedInsert(Node head, int x) {
		Node temp = new Node(x);
		if(head == null)
			return temp;
		if(x<head.data) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while(curr!=null && curr.next.data<x) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
