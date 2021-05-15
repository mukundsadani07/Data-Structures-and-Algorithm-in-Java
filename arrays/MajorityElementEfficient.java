package arrays;

public class MajorityElementEfficient {
	static int findMajority(int[] arr) {
		
		//Find a candidate
		int res = 0, count = 1;
		int n = arr.length;
		for(int i=1;i<n;i++) {
			if(arr[res] == arr[i])
				count++;
			else
				count--;
			if(count == 0) {
				res = i;
				count = 1;
			}
		}
			//Check if the candidate is actually a majority
			count = 0;
			for(int j=0;j<n;j++)
				if(arr[res] == arr[j])
					count++;
			if(count<=n/2)
				res = -1;
			return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,8,4,8,8};
		System.out.println(findMajority(arr));
	}

}
