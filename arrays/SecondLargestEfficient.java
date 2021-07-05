package arrays;

public class SecondLargestEfficient {
	static int secondLargest(int arr[]) {
		int n = arr.length;
		int res = -1, largest = 0;
		for(int i=1;i<n;i++) {
			if(arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}else if(arr[i]<arr[largest]) {
				if(res ==-1 || arr[i]>arr[res])
					res = i;
			}
		}
		return arr[res];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,0,4,15};
		int p =secondLargest(arr);
		System.out.println(p);
	}
}
