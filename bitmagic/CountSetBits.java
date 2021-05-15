package bitmagic;

public class CountSetBits {
	int countBits(int n) {
		int res = 0;
		while(n>0) {
//			if(n % 2 !=0)
//				res +=1;
//			n=n/2;
			
			//2nd way
			res = res + (n&1);
			n = n>>1; //right shift 
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
