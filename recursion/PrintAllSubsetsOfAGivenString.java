package recursion;

public class PrintAllSubsetsOfAGivenString {
	static void printSub(String str,int index,String curr) {
		if(index==str.length()) {
			System.out.print(curr+" ");
			return;
		}
		printSub(str, index+1, curr);
		printSub(str, index+1, curr+ str.charAt(index));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSub("abc",0,"");
	}
}
