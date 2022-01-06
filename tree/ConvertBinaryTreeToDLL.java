package tree;

public class ConvertBinaryTreeToDLL {
	static Node prev = null;
	static Node convert(Node root) {
		if(root==null)
			return root;
		Node head = convert(root.left);
		if(prev == null)			
			head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		convert(root.right);
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
