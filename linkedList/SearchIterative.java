package linkedList;


public class SearchIterative {
	int search(Node head, int x) {
		int pos = 1;
		Node curr = head;
		while(curr!=null) {
			if(curr.data== x) {
				return pos;
			}else
			{
				pos++;
				curr = curr.next;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
