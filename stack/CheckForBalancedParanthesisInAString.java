package stack;
import java.util.Scanner;
import java.util.Stack;

public class CheckForBalancedParanthesisInAString {
	static boolean isBalanced(String str) {
//		Stack<Character> s = new Stack<Character>();
//		for(int i=0;i<str.length();i++) {
//			char c = str.charAt(i);
//			if(c ==  '(' || c == '{' || c=='['){
//				s.push(c);
//			}else {
//				if(s.isEmpty()==true) {
//					return false;
//				}else if(matching(c,s.peek()) == false) {
//					return false;
//				}else {
//					s.pop();				
//				}
//			}
//		}
//		return (s.isEmpty() == true);
//	}
		Stack<Character> st = new Stack<Character>();
        for(char c:str.toCharArray()){
            if(c == '{')
                st.push('}');
            else if(c == '[')
                st.push(']');
            else if(c == '(')
                st.push(')');
            else if(st.isEmpty() || c!=st.pop())
                return false;            
        }
        return st.isEmpty();
	}
	
//	boolean matching(char b,char a) {
//		return (a== '(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i!=0) {
		System.out.println("Enter the paranthesis: ");
		String s = sc.nextLine();
		System.out.println(isBalanced(s));
		System.out.println("Enter 0 to exit and 1 to continue");
		i = sc.nextInt();
		}
	}
}
