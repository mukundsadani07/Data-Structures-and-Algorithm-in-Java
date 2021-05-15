package sorting;

//negative and postive numbers
public class SortAnArrayWith2TypesOfElementEfficient {
	static void sort(int[] arr) {
		int n = arr.length;
		int i=-1, j=n;
		while(true) {
//			do{i++;}while(arr[i]<0);
			do{i++;}while(arr[i]%2!=0);
			do{j--;}while(arr[j]%2==0);
			if(i>=j)
				return;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {5,2,5,-9,4,-10,2,0};
		int[] arr = {2,7,4,6,8,5};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
