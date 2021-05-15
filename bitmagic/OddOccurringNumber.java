package bitmagic;

public class OddOccurringNumber {
	static void oddOccurring(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count%2!=0)
				System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,4,4,4,5,5};
		oddOccurring(arr);
	}

}
