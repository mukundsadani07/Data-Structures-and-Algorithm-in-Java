package tree;

public class MaximumInBinaryTree {
	int getMax(Node root) {
		if(root == null)
			return Integer.MIN_VALUE;
		else
			return Math.max(root.key, Math.max(getMax(root.left),getMax(root.right)));
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
