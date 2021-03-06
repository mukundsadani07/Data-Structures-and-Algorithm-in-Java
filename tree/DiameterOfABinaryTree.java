package tree;

public class DiameterOfABinaryTree {
	
	static int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		int d1 = 1+height(root.left)+height(root.right);
		int d2 = diameter(root.left);
		int d3 = diameter(root.right);
		return Math.max(d1, Math.max(d2, d3));
	}
	static int height(Node root) {
		if(root == null) {
			return 0;
		}else {
			return 1+ Math.max(height(root.left),height(root.right));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
