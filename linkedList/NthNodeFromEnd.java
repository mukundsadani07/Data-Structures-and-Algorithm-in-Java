package linkedList;

public class NthNodeFromEnd {
	void printNthFromEnd(Node head,int n) {
		int len = 0;
		for(Node curr = head; curr!=null;curr = curr.next)
			len++;
		if(len<n)
			return;
		Node curr = head;
		for(int i=0;i<len-n-1;i++)
			curr = curr.next;
		System.out.println(curr.data);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
