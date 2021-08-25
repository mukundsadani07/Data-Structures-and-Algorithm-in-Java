package binarySearchTree;

public class FloorInABST {
	static Node floor(Node root,int x) {
		Node res = null;
		while(root!=null) {
			if(root.key == x) {
				return root;
			}else if(root.key>x) {
				root = root.left;
			}else {
				res = root;
				root = root.left;
			}
		} 
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
