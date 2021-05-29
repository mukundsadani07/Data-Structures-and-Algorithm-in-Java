package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthBinaryTree {
	static int maxWidth(Node root) {
		if(root==null)
			return 0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int res = 0;
		while(!q.isEmpty()) {
			int n = q.size();
			res = Math.max(res, n);
			for(int i=0;i<n;i++) {
				Node curr = q.poll();
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
