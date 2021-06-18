package greedy;

import java.util.Arrays;
import java.util.Collections;

public class MinimumNoOfCoin {
	static int minCoins(Integer coins[],int n,int amount) {
		
		Arrays.sort(coins, Collections.reverseOrder());
		
		int res = 0;
		for(int i=0;i<n;i++) {
			if(coins[i]<=amount) {
				int c = (int)Math.floor(amount/coins[i]);
				res = res+c;
				amount = amount - c*coins[i];
			}
			if(amount == 0) {
				return res;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {5,10,2,1};
		int n = arr.length;
		int p = minCoins(arr,n,57);
		System.out.println(p);
	}
}
