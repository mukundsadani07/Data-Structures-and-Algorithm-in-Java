package linkedList;

public class DetectLoop2 {
	static boolean isLoop(Node head) {
		Node temp = new Node(0);
		Node curr = head;
		while(curr!=null) {
			if(curr.next == null) {
				return false;
			}
			if(curr.next == temp) {
				return true;
			}
			Node curr_next = curr.next;
			curr.next = temp;
			curr = curr_next;
			
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
