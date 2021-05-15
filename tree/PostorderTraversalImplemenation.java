package tree;

public class PostorderTraversalImplemenation {
	void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key+"");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
