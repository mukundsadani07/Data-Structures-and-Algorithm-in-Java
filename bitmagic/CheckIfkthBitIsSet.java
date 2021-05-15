package bitmagic;

public class CheckIfkthBitIsSet {
	//method 1
//	static void kthBit(int n,int k) {
//		if((n &(1<<(k-1)))!=0)
//			System.out.println("yes");
//		else
//			System.out.println("No");
//	}
	
	//Method 2
	static void kthBit(int n,int k) {
		if(((n>>(k-1))&1)==1)
			System.out.println("yes");
		else
			System.out.println("No");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kthBit(5,3);
	}
}
