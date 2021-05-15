package tree;

public class HeightOfABinaryTree {
	int height(Node root) {
		if(root == null)
			return 0;
		else 
			return Math.max(height(root.left), height(root.right))+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
