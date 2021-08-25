package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter the power");
		int p = Integer.parseInt(br.readLine());
		int ans = power(n,p);
		System.out.println(ans);
	}

	static int power(int n, int p) {
		// TODO Auto-generated method stub
		if(p == 1) {
			return n;
		}else {
			return n*power(n,p-1);
		}
	}
}
