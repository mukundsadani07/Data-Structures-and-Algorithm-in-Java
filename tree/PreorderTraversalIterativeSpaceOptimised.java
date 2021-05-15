package tree;

import java.util.Stack;

public class PreorderTraversalIterativeSpaceOptimised {
	void iterativePreorder(Node root) {
		if(root == null)
			return;
		Stack<Node> s = new Stack<Node>();  
		Node curr = root;
		while(curr!=null || s.isEmpty() == false) {
			while(curr!=null) {
				System.out.print(curr.key+" ");
				if(curr.right!=null)
					s.push(curr.right);
				curr = curr.left;
			}
			if(s.isEmpty() == false)
				curr = s.pop();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
