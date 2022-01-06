package linkedList;

public class ReversingEfficientSolution {
	Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;//prev is now head
	}
	public static void main(String[] a) {
		// TODO Auto-generated method stub
		
	}
}
