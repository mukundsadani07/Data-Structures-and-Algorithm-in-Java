package binarySearchTree;


class Node{
	int key;
	Node left;
	Node right; //references
	Node(int k){
		key = k;
	}
}

public class SearchRecursive {
	boolean search(Node root,int x) {
		if(root == null)
			return false;
		else if(root.key == x)
			return true;
		else if(root.key<x)
			return search(root.left,x);
		else
			return search(root.right,x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
