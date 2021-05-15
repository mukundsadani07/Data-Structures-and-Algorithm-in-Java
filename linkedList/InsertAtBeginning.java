package linkedList;

//class Node{
//	int data;
//	Node next;
//	Node(int x){
//		data = x;
//		next = null;
//	}
//}
public class InsertAtBeginning {
	static Node insertBegin(Node head,int x) {
		 Node temp = new Node(x);
		 temp.next = head;
		 return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
	}

}
