package tree;

public class CheckForBalancedtree {
	static boolean balancedTree(Node root) {
		if(root == null){
		    return true;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return (Math.abs(lh-rh)<=1 && balancedTree(root.left) && balancedTree(root.right)); 
		
	}
	static int height(Node root) {
		if(root == null)
			return 0;
		else
			return 1+Math.max(height(root.left),height(root.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
