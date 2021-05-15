package backtracking;

public class PrintAllPermutationsOfAStringNotContainingAB {
	static void permute(String str,int l,int r) {
		if(l==r) {
			
			System.out.println(str);
			return;
		}
		else {
			for(int i=l;i<=r;i++) {
				if(isSafe(str,l,i,r)) {
				char[] c = str.toCharArray();
				//swap
				char temp = c[l];
				c[l] = c[i];
				c[i] = temp;
				
				permute(str,l+1,r);
				
				//swap
				char x = c[l];
				c[l] = c[i];
				c[i] = x;
				}
			}
		}
	}
	static boolean isSafe(String str,int l,int i, int r) {
		if(l!=0 && str.charAt(i-1) == 'A' && str.charAt(i) == 'B')
			return false;
		if(r==l+1  &&  str.charAt(i) == 'A' && str.charAt(i) == 'B')
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("ABC",0,2);
		
	}

}
