package tree;

import java.util.Stack;

public class InorderTraversalIterative {
	void iterativeInorder(Node root) {
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(curr!=null || !s.isEmpty()) {
			while(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.println(curr.key+" ");
			curr = curr.right;
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
