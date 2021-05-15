package stack;

import java.util.Stack;

public class CheckForBalancedParanthesisInAString {

	boolean isBalanced(String str) {
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c ==  '(' || c == '{' || c=='['){
				s.push(c);
			}else {
				if(s.isEmpty()==true) {
					return false;
				}else if(matching(c,s.peek()) == false) {
					return false;
				}else {
					s.pop();				
				}
			}
		}
		return (s.isEmpty() == true);
		
	}
	
	boolean matching(char b,char a) {
		return (a== '(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
