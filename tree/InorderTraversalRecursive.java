package tree;


public class InorderTraversalRecursive {
	void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.key+"");
			inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
