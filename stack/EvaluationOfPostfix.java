package stack;
import java.util.Stack;

public class EvaluationOfPostfix {
	
	//Method 2
//	static int evaluatePostfix(String exp)
//    {
//        //create a stack
//        Stack<Integer> stack = new Stack<>();
//          
//        // Scan all characters one by one
//        for(int i = 0; i < exp.length(); i++)
//        {
//            char c = exp.charAt(i);
//              
//            if(c == ' ')
//            continue;
//              
//            // If the scanned character is an operand 
//            // (number here),extract the number
//            // Push it to the stack.
//            else if(Character.isDigit(c))
//            {
//                int n = 0;
//                  
//                //extract the characters and store it in num
//                while(Character.isDigit(c))
//                {
//                    n = n*10 + (int)(c-'0');
//                    i++;
//                    c = exp.charAt(i);
//                }
//                i--;
//  
//                //push the number in stack
//                stack.push(n);
//            }
//              
//            // If the scanned character is an operator, pop two
//            // elements from stack apply the operator
//            else
//            {
//                int val1 = stack.pop();
//                int val2 = stack.pop();
//                  
//                switch(c)
//                {
//                    case '+':
//                    stack.push(val2+val1);
//                    break;
//                      
//                    case '-':
//                    stack.push(val2- val1);
//                    break;
//                      
//                    case '/':
//                    stack.push(val2/val1);
//                    break;
//                      
//                    case '*':
//                    stack.push(val2*val1);
//                    break;
//            }
//            }
//        }
//        return stack.pop(); 
//    }
	
	//method 1
	static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();
          
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
              
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
            stack.push(c - '0');
              
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                  
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                      
                    case '-':
                    stack.push(val2- val1);
                    break;
                      
                    case '/':
                    stack.push(val2/val1);
                    break;
                      
                    case '*':
                    stack.push(val2*val1);
                    break;
              }
            }
        }
        return stack.pop();    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String exp = "100 200 + 2 / 5 * 7 +";
		String exp = "231*+9-";
        System.out.println(evaluatePostfix(exp));
	}
}
