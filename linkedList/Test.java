package linkedList;

class Node{
	int data;
	Node next;
	Node(int x)
	{
		data = x;
		next = null; //this is optional
	}
}
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
	}

}
