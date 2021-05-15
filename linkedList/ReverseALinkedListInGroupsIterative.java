package linkedList;

public class ReverseALinkedListInGroupsIterative {
	static Node reverseInGrps(Node head,int x) {
		Node curr = head,prevFirst=null;
		boolean isFirstPass = true;
		while(curr!=null) {
			Node first = curr,prev = null;
			int count = 0;
			while(curr!=null && count<x) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(isFirstPass) {
			head = prev;
			isFirstPass = false;
			}else {
				prevFirst.next = prev;
			}
		prevFirst = first;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
