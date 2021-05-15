package recursion;

public class PrintNumbersFrom1ToN {
	//Simple Recursion
	static void func(int n) {
		if(n<=0)return;
		func(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(6);
	}

}
