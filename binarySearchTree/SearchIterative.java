package binarySearchTree;

public class SearchIterative {
	boolean search(Node root,int x) {
		while(root!=null) {
			if(root.key == x)
				return true;
			else if(root.key<x)
				root = root.right;
			else
				root = root.left;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
