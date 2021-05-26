package tree;

import java.util.Stack;

public class PostorderTraversalIterative {
	static void iterativePostorder(Node root) {
		if(root == null)
			return;
		Stack<Node> s = new Stack<>();
		Node curr = root;
		s.push(curr);
		while(curr!=null || !s.isEmpty()) {
			while(curr!=null) {
				if(curr.right!=null) {
					s.push(curr.right);
				}
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
