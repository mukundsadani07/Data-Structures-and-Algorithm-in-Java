package tree;

public class ChildrenSumPropertyRecursive {
	static boolean isSum(Node root) {
		if(root == null)
			return true;
		if(root.right ==null && root.left == null)
			return true;
		int sum = 0;
		if(root.left!=null)
			sum+=root.left.key;
		if(root.right!=null)
			sum+=root.right.key;
		return(root.key == sum && isSum(root.left) && isSum(root.right));
	}
	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.right = new Node(5);
		root.left.left = new Node(3);
		System.out.println(isSum(root));
	}
}
