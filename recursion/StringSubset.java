package recursion;

public class StringSubset {
	void printSub(String str,String curr,int index) {
		curr="";
		index = 0;
		
		if(index==str.length()) {
			System.out.println(curr+"");
			return;
		}
		printSub(str, curr, index+1);
		printSub(str, curr+ str.charAt(index), index+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
