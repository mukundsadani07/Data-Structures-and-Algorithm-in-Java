package bitmagic;

//Brion kerningam's Algorithm
public class CountSetBits2 {
	int countBits(int n) {
		int res = 0;
		while(n>0) {
			n = (n &(n-1));
			res++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
