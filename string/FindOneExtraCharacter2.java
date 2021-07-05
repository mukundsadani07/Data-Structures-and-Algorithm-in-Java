package string;

public class FindOneExtraCharacter2 {
	static char extraChar(String s1,String s2) {
		//Assumption only lowercase characters
		int[] count = new int[26];
		int n1 = s1.length();
		int n2 = s2.length();
		if(n1==n2) {
			return 0;
		}
		for(int i=0;i<n1;i++) {
			count[s1.charAt(i)-'a']--;
			count[s2.charAt(i)-'a']++;
		}
		count[s2.charAt(n1)-'a']++;
		for(int i=0;i<26;i++) {
			if(count[i] == 1) {
				return (char)(i+'a');
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abbdc";
		System.out.println(extraChar(s1,s2));
	}
}
