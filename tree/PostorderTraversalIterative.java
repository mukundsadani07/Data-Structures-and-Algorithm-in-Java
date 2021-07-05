package tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversalIterative {
	 static ArrayList<Integer> postOrder(Node root) {
	        // code here
	        ArrayList<Integer> res = new ArrayList<>();
	        Stack<Node> i = new Stack<>();
	        Stack<Node> o = new Stack<>();
	        i.push(root);
	        Node curr = root;
	        while(!i.isEmpty()){
	            curr = i.pop();
	            o.push(curr);
	            if(curr.left!=null){
	                i.push(curr.left);
	            }
	            if(curr.right!=null){
	                i.push(curr.right);
	            }
	        }
	        while(!o.isEmpty()){
	            Node s = o.pop();
	            res.add(s.key);
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
