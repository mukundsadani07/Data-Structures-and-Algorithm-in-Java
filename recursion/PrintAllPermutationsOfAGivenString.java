package recursion;

public class PrintAllPermutationsOfAGivenString {
	static void permutations(char[] c,int l,int r) {
		if(l==r) {
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			return;
		}
		for(int i=l;i<=r;i++) {
			swap(c,l,i); //find combinations
			permutations(c,l+1,r);
			swap(c,l,i); //backtracking
		}
	}
	static void swap(char[] c,int l,int i) {
		char temp = c[l];
		c[l] = c[i];
		c[i] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		char[] c = s.toCharArray();
		permutations(c,0,s.length()-1);
	}
}
