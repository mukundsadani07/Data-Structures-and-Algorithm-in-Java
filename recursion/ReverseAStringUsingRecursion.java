package recursion;

public class ReverseAStringUsingRecursion {
	static void reverse(String s) {
		if(s.length()==0) {
			return;
		}else {
			String rev = s.substring(1);
			reverse(rev);
			System.out.print(s.charAt(0));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BINOD";
		reverse(s);
	}

}
