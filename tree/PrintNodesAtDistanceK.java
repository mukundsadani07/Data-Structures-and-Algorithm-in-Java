package tree;


public class PrintNodesAtDistanceK {
	static void printNodes(Node root,int k) {
		if(root == null)
			return;
		if(k==0)
			System.out.println(root.key+" ");
		else {
			printNodes(root.left,k-1);
			printNodes(root.right,k-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
	}
}
