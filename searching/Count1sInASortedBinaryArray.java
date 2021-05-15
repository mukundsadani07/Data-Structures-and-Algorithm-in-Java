package searching;

public class Count1sInASortedBinaryArray {
	//Naive
//	static int count1s(int[] arr) {
//		int n = arr.length;
//		int count = 0;
//		for(int i = n-1;i>=0;i--) {
//			if(arr[i] == 1) {
//				count++;
//			}else {
//				break;
//			}
//		}
//		return count;
//	}
	
	//Efficient
	static int count1s(int[] arr) {
		int n = arr.length;
		int l = 0,h=n-1;
		while(h>=l) {
			int mid = l+ (h-l)/2;
			if(arr[mid] == 0)
				l=mid+1;
			else {
				if(mid == 0 || arr[mid-1]==0)
					return (n-mid);
				else
					h=mid-1;	
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,0,1,1,1};
		int k = count1s(arr);
		System.out.println(k);
	}
}
