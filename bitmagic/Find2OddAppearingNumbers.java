package bitmagic;

public class Find2OddAppearingNumbers {
	static void oddAppearing(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count%2!=0)
				System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,3,4,5,4,4,6,7,7};
		int n = arr.length;
		oddAppearing(arr,n);
	}

}
