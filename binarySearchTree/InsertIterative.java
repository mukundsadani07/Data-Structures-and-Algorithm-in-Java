package binarySearchTree;

public class InsertIterative {
	Node insert(Node root,int x) {
		Node temp = new Node(x);
		Node parent = null, curr= root;
		while(curr!=null) {
			parent = curr;
			if(curr.key>x) {
				curr = curr.left;
			}
			else if(curr.key < x)
				curr = curr.right;
			else
				return root;
		}//End of while loop
		if(parent == null) // corner case (when root=null)
			return temp;
		//When only 1 node(1 parent) is present
		if(parent.key>x)  
			parent.left = temp;
		else 
			parent.right = temp;
		return root;
	}//End of the function 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
