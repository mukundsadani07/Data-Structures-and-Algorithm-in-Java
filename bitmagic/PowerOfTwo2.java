package bitmagic;

public class PowerOfTwo2 {
	//Brion Kerningam's Algorithm
	boolean isPow2(int n) {
		if (n==0)
			return false;
		return ((n &(n-1))==0);
	}
	
	//2nd way
	boolean isPower2(int n) {
		return (n!=0) && ((n&(n-1))==0);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
