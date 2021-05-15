package arrays;

public class LeftRotateArrayByD_2 {
	static void leftRotate(int[] arr,int n,int d) {
		int[] temp= new int[d];
		for(int i=0;i<d;i++)
			temp[i] = arr[i];
		for(int i=d;i<n;i++)
			arr[i-d] = arr[i];
		for(int i=0;i<d;i++)
			arr[n-d+i] = temp[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] arr = {1,2,3,4};
		int d = 2;
		System.out.println("The original array is ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		leftRotate(arr,n,d);

		System.out.println("The new array is ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
