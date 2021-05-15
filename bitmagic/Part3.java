package bitmagic;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 33;
		//right shift operator 
		System.out.println(x>>2);
		//right shifting 2 by any number will give -1 as the answer
		System.out.println(-2>>1);
		
		//unsigned right shift
		int y = -2;
		System.out.println(x>>>2);
	}
}
