package bitmagic;

public class Find2OddAppearingNumbers2 {
	static void oddAppearing(int[] arr,int n) { 
		int xor = arr[0],res1 = 0,res2 = 0;
		for(int i=1;i<n;i++)
			xor = xor^arr[i];
		
		//rightmost set bit
		int sn = xor & ~(xor-1);
		for(int j=0;j<n;j++) {
			if((arr[j] & sn)!=0)
				res1 = res1 ^ arr[j];
			else
				res2 = res2 ^ arr[j];
		}
			
		System.out.print(res1+" "+res2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,3,4,5,4,4,6,7,7};
		int n = arr.length;
		oddAppearing(arr,n);
	}

}
