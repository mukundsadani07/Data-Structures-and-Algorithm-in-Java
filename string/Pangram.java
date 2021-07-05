package string;

public class Pangram {
	static boolean pangram(String str) {
		int n = str.length();
		//corner case
		if(n<26) {
			return false;
		}
//		str.toLowerCase();
		boolean[] visited = new boolean[26];
		for(int i=0;i<n;i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z')
				visited[c-'a'] = true;
			if(c>='A' && c<='Z')
				visited[c-'A'] = true;
		}
		for(int i=0;i<26;i++) {
			if(visited[i] == false)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(pangram(str));
	}
}
