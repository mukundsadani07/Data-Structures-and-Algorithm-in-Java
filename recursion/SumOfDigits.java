package recursion;

public class SumOfDigits {
	int fun(int n) {
		if(n<10)
			return n;
		return (n%10) + fun(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
