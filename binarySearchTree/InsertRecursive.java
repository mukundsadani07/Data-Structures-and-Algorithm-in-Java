package binarySearchTree;

public class InsertRecursive {
	Node insert(Node root, int x) {
		if(root == null)
			return new Node(x);
		if(root.key>x)
			root.left = insert(root.left,x);
		else if(root.key<x)
			root.right = insert(root.right,x);
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
