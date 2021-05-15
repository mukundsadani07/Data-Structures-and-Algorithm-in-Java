package sorting;

public class SortAnArrayWith3TypesOfComponentsEfficient {
	static void sort(int[] arr) {
		int n = arr.length;
		int l = 0,h = n-1,mid = 0;
		while(mid<=h) {
			switch(arr[mid]) { 
			case 0: 
				//swap
				if(mid!=l) {
				int temp = arr[l];
				arr[l] = arr[mid];
				arr[mid] = temp;
				}
				l++;mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				//swap
				int temp1 = arr[mid];
				arr[mid] = arr[h];
				arr[h] = temp1;
				h--;
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,0,1,2,0,2,1,0,0};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
