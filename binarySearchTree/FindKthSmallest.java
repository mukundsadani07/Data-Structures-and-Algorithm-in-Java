package binarySearchTree;

public class FindKthSmallest {
	static int count = 0;
	//O(h+k)
	static void printkth(Node root,int k) {
		if(root!=null) {
			printkth(root.left,k);
			count++;
			if(count == k) {
				System.out.println(root.key);
				return;
			}
			printkth(root.right,k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
