package linkedList;

public class NthNodefromEndTwoPointer {
	void printingNthNode(Node head,int n) {
		if(head == null) return;
		Node first = head;
		for(int i=0;i<n;i++) {
			if(first == null) return;
			first = first.next;
		}
		Node second = head;
		while(first!=null) {
			second = second.next;
			first = first.next;
		}
		System.out.println(second.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
