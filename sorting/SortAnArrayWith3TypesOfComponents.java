package sorting;

public class SortAnArrayWith3TypesOfComponents {
	
	//naive
	static void sort(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		int i=0;
		for(int j=0;j<n;j++) {
			if(arr[j] == 0) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0;j<n;j++) {
			if(arr[j] == 1) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0;j<n;j++) {
			if(arr[j] == 2) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0;j<n;j++) {
			arr[j] = temp[j];
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
