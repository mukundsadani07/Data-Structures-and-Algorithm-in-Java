package linkedList;

public class DeleteANodeWithOnlyPointerGivenToIt {
	static void deleteNode(Node x) {
		x.data = x.next.data;
		x.next = x.next.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
