package arrays;

public class MajorityElement {
	static int majorityElement(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count > n/2)
				return arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,7,6,8,6,6,6,6};
		System.out.println(majorityElement(arr));
	}

}
