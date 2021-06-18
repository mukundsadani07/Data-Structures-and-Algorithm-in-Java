package string;

import java.util.Arrays;

public class LeftmostCharacterThatRepeats {
	static int firstRepeating(String s) {
		int res = Integer.MAX_VALUE;
		int[] fi = new int[256];
		Arrays.fill(fi, -1);
		for(int i=s.length()-1;i>=0;i--) {
			if(fi[s.charAt(i)] == -1)
				fi[s.charAt(i)] = i;
			else
				res = i;
				
		}
		return res == Integer.MAX_VALUE? -1 :res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "geeksforgeeks";
		String s = "hello";
		System.out.println(firstRepeating(s));
	}
}
