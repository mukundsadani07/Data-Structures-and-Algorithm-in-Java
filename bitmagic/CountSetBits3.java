package bitmagic;

public class CountSetBits3 {
	
	static int[] table = new int[256];
	void initialize() {
		table[0] = 0;
		for(int i=0;i<256;i++)
			table[i] = (i&1) + table[i/2];
	}
	
	static int countBits(int n) {
		int res = table[n & 0xff];
		n = n>>8;
		res = res + table[n & 0xff];
		n = n>>8;
		res = res + table[n & 0xff];
		n = n>>8;
		res = res + table[n & 0xff];
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBits(5));
	}
}
