package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewIterative {
	static void printLeft(Node root) {
		 Queue<Node> q = new LinkedList<Node>();
		 q.add(root);
		 while(!q.isEmpty()) {
			 int count = q.size();
			 for(int i=0;i<count;i++) {
				 Node curr = q.poll();
				 if(i==0)
					 System.out.println(curr.key+" ");
				 if(curr.left!=null)
					 q.add(curr.left);
				 if(curr.right!=null)
					 q.add(curr.right); 
			 }
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(7);
		root.right = new Node(10);
		root.left.right = new Node(9);
		
		printLeft(root);
	}
}
