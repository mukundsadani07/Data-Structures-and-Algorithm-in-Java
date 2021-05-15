package tree;

public class SizeOfABinaryTree {
	int getSize(Node root) {
		if(root==null) 
			return 0;
		else 
			return 1+getSize(root.left) + getSize(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
