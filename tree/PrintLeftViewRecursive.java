package tree;


public class PrintLeftViewRecursive {
	static void printLeft(Node root,int level) {
		if(root == null)
			return;
		int maxLevel = 0;
		if(maxLevel<level) {
			System.out.println(root.key+" ");
			maxLevel = level;
		}
		printLeft(root.left,level+1);
		printLeft(root.right,level+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(7);
		root.right = new Node(10);
		root.left.right = new Node(24);
		printLeft(root,1);
	}
}


