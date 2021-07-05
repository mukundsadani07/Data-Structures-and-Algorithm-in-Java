package arrays;

public class TrappingRainWaterEfficient {
	static int getWater(int[] arr,int n) {
		int res = 0;
		
		//method 1 
		
//		int[] lmax = new int[n];
//		int[] rmax = new int[n];
//		
//		lmax[0] = arr[0];
//		for(int i=1;i<n;i++)
//			lmax[i] = Math.max(arr[i], lmax[i-1]);
//		
//		rmax[n-1] = arr[n-1];
//		for(int i=n-2;i>=0;i--)
//			rmax[i] = Math.max(arr[i], rmax[i+1]);
//		
//		for(int i=1;i<n-1;i++)
//			res += (Math.min(lmax[i], rmax[i])-arr[i]);
		
		//method 2
		
        int lmax = arr[0],rmax = arr[n-1];
        int start = 1,end = n-2;
        while(start<=end){
            lmax = Math.max(lmax,arr[start]);
            rmax = Math.max(rmax,arr[end]);
            if(lmax<rmax){
                res+=lmax - arr[start++];
            }else{
                res+=rmax - arr[end--];
            }
        }
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,0,6,2,3};
		int n = arr.length;
		int p = getWater(arr,n);
		System.out.println(p);
	}

}
