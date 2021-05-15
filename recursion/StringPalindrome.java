package recursion;

public class StringPalindrome {
	//initially s=0, e=n-1(last element of the string)
	boolean isPal(String str, int s, int e) {
		if(s==e)
			return true;
		if(s>e)
			return true;
		if(str.charAt(s) != str.charAt(e))
			return false;
		return isPal(str,s+1,e-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
