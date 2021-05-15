package sorting;

public class SortAnArrayWith2TypesOfElement {
	static void sort2Types(int[] arr) {
		int n = arr.length;
		int i = 0;
		int[] temp = new int[n];
		for(int j=0;j<n;j++) {
			if(arr[j]<0) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j = 0;j<n;j++) {
			if(arr[j]>=0) {
				temp[i] = arr[j];
				i++;
			}
		}
		
		for(int j=0;j<n;j++) {
			arr[j] = temp[j];
		}
//		int j = 0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]<0) {
//				if(i!=j) {
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//				}
//				j++;
//			}
//		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,2,-6,-2,4,7};
		sort2Types(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
