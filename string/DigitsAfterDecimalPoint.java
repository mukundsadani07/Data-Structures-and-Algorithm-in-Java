package string;

public class DigitsAfterDecimalPoint {
	static String digitAfter(String s) {
		int i = s.indexOf('.');
		if(i<0) {
			return "";
		}else {
			return s.substring(i+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12.385";
		System.out.println(digitAfter(s));
	}
}
