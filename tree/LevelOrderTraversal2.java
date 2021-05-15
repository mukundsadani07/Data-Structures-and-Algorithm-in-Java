package tree;
import java.util.*;

public class LevelOrderTraversal2 {
	void printLevelOrder(Node root) {
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty() == false) {
			int count = q.size();
			for(int i=0;i<count;i++) { 
				Node curr = q.poll();
				System.out.print(curr.key+" ");
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
