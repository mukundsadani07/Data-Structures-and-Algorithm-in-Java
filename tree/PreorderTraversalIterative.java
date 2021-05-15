package tree;

import java.util.Stack;

public class PreorderTraversalIterative {
	void iterativePreorder(Node root) {
		if(root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(s.isEmpty() == false) {
			Node curr = s.pop();
			System.out.println(curr.key+" ");
			if(curr.right!=null)
				s.push(curr.right);
			if(curr.left!=null)
				s.push(curr.left);
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
