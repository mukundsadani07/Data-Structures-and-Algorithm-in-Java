package mathematics;
 
public class FindingNumberOfDigitsInANumber {
	//Iterative Solution
	int countDigit(long n) {
		int count = 0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	//Recursive Solution
	int countDigitRecursive(long n) {
		if(n==0) 
			return 0;
		else 
			return 1+countDigit(n/10);
	}
	//Logarithmic Solution
//	int countDigitLog(long n) {
//		return floor(log 10(n)+1);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
