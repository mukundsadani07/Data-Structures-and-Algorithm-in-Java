package string;

import java.util.Arrays;

public class FindOneExtraCharacter {
	static char extraChar(String s1, String s2) {
		if(s1.length() == s2.length()) {
			return ' ';
		}
		char a1[] = s1.toCharArray();
		char a2[] = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0;i<s1.length();i++) {
			if(a1[i]!=a2[i]) {
				return a2[i];
			}
		}
		return a2[s2.length()-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abcdd";
		System.out.println(extraChar(s1,s2));
	}
}
