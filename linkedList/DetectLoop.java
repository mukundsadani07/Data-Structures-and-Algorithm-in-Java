package linkedList;


public class DetectLoop {
	static Node1 head;
	static class Node1{
		int data;
		Node1 next;
		boolean visited;
		Node1(int x)
		{
			data = x;
			next = null;
			visited = false;//this is optional
		}
	}
	static void loopD(Node1 head) {
		if(head == null)
			return;
		Node1 curr = head;
		Node1 next = head; 
		while(curr!=null) {
			if(curr.visited == true) {
				System.out.println("Loop is present");
				break;
			}
			curr.visited = true;
			curr = curr.next;
			}System.out.println("Loop is not present");
		}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoop llist = new DetectLoop();
		llist.head     = new Node1(1); 
        Node1 second     = new Node1(2); 
        Node1 third     = new Node1(3);
        
        llist.head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node
        loopD(head);
	}
}
