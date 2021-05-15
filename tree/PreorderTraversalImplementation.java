package tree;

public class PreorderTraversalImplementation {
	void preorder(Node root) {
		if(root!=null) {
			System.out.println(root.key+"");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
