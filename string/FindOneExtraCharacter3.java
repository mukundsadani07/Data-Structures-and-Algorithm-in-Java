package string;

public class FindOneExtraCharacter3 {
	static char extraChar(String s1,String s2) {
		int res = 0;
		int n = s1.length();
		for(int i=0;i<n;i++) {
			res = res^s1.charAt(i)^s2.charAt(i);
		}
		res = res^s2.charAt(n);
		return (char)(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abbdc";
		System.out.println(extraChar(s1,s2));
	}
}
