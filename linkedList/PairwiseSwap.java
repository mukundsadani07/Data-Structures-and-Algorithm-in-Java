package linkedList;

public class PairwiseSwap {
	//Method 1(Swapping Data) [Might not be efficient when the size of the data is big]
	static void pairwise(Node head) {
		Node curr = head;
		while(curr!=null && curr.next!=null) {
			//swap
			int temp = curr.data;
			curr.data = curr.next.data;
			curr.next.data = temp;
			//move 2 places ahead
			curr = curr.next.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
