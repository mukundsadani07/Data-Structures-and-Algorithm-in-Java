package string;


public class LexicographicRank {
	static int lexicographic(String s) {
		int rank = 1;
		int n = s.length();
		int mul = fact(n);
		int count[] = new int[256];
		for(int i=0;i<n;i++) {
			++count[s.charAt(i)];
		}
		for(int i=1;i<256;i++) {
			count[i] = count[i]+count[i-1];
		}
		for(int i=0;i<n;i++) {
			mul /=n-i;
			rank +=count[s.charAt(i)-1]*mul;
			for(int j=s.charAt(i);j<256;j++) {
				--count[j];
			}
		}	
		return rank;
	}
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hel";
		int p = lexicographic(s);
		System.out.println(p);
	}
}
