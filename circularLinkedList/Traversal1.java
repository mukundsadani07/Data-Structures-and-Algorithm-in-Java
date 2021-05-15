package circularLinkedList;

class Node{
	int data;
	Node next;
	Node(int x)
	{
		data = x;
		next = null; //this is optional
	}
}
	public class Traversal1 {
	void printList(Node head) {
		if(head == null) return;
		System.out.println(head.data + "");
		for(Node r= head;r!=head;r=r.next)
			System.out.println(r.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
