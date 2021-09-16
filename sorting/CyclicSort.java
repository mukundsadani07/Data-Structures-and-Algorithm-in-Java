package sorting;

public class CyclicSort {
	static void sort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i] - 1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
	}
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3,5,1,2,4};
		int[] arr = {1,3,4,2,2};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
