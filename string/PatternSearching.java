package string;

public class PatternSearching {
	static void patternSearch(String s1,String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int pos = s1.indexOf(s2);
		while(pos>=0) {
			System.out.print(pos+" ");
			pos = s1.indexOf(s2,pos+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeks for geeks";
		String s2 = "geeks";
		patternSearch(s1,s2);
	}
}
