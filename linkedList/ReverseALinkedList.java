package linkedList;

import java.util.ArrayList;

public class ReverseALinkedList {
	Node revList(Node head) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(Node curr = head; curr!= null; curr = curr.next) {
			arr.add(curr.data);
		}
		for(Node curr = head; curr!=null;curr= curr.next)
			curr.data = arr.remove(arr.size()-1);
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
