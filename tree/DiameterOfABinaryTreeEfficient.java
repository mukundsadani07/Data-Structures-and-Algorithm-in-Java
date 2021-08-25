package tree;

//import java.util.HashMap;

public class DiameterOfABinaryTreeEfficient {
	static class A{
		int res = Integer.MIN_VALUE;
	}
	static int height(Node root,A a) {
		if(root == null) {
			return 0; 
		}
		int lh = height(root.left,a);
		int rh = height(root.right,a);
		a.res = Math.max(a.res, 1+lh+rh);
		return 1+Math.max(lh, rh);
	}
	static int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		A a = new A();
		int h = height(root,a);
		return a.res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
}
