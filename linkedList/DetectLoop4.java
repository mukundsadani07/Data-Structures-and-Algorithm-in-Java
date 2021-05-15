package linkedList;

import java.util.HashSet;

public class DetectLoop4 {
	boolean isLoop(Node head) {
		HashSet<Node> s = new HashSet<Node>();
		for(Node curr= head;curr!=null;curr=curr.next) {
			if(s.contains(curr)) {
				return true;
			}
			s.add(curr);
		}return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
