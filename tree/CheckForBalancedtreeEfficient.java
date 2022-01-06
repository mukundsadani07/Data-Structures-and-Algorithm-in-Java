package tree;

public class CheckForBalancedtreeEfficient {
	static int isBalanced(Node root) {
		if(root == null)
			return 0;
		int lh = isBalanced(root.left);
		if(lh == -1) 
			return -1;
		int rh = isBalanced(root.right);
		if(rh == -1)
			return -1;
		if(Math.abs(lh-rh)>1)
			return -1;
		else
			return Math.max(lh, rh) +1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
