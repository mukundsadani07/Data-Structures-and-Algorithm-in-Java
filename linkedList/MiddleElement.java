package linkedList;

public class MiddleElement {

	void printMiddle(Node head) {
		if(head == null)
			return;
		int count = 0;
		Node curr; 
		for(curr = head; curr!=null;curr=curr.next)
			count++;
		curr = head;
		for(int i=0;i<count/2;i++)
			curr = curr.next;
		System.out.println(curr.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
