package searching;

public class SearchInAnInfiniteSortedArray {
	//O(position)
	//O(1): Aux
	static int search(int[] arr,int x) {
		int i = 0;
		while(true) {
			if(arr[i] == x)
				return i;
			if(arr[i]>x)
				return -1;
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
