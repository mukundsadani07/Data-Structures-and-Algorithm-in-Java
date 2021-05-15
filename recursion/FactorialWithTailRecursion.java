package recursion;

public class FactorialWithTailRecursion {
	int fact(int n,int val) {
		val = 1;
		if(n==0)
			return val;
		return fact(n-1,n*val);
	}
	
	static void func(int n) {
		if(n<1)
			return;
		System.out.println(n);
		func(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(5);
	}
}
