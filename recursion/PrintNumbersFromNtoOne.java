package recursion;

public class PrintNumbersFromNtoOne {
	//Tail Recursion
	static void func(int n) {
		if (n==0) return;
		System.out.println(n);
	    func(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(6);
	}

}
