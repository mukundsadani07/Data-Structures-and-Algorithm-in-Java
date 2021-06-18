package string;

public class Anagrams {
	static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		//256 is the total number of characters 
		char count[] = new char[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++) {
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeks";
		String s2 = "eksge";
		System.out.println(anagram(s1,s2));
	}
}
