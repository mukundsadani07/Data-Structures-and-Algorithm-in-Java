package arrays;

import java.util.Scanner;

public class LeftRotateArrayByD_1 {
	static void leftRotateOne(int[] arr,int n) {
		int temp = arr[0];
		for(int i=1;i<n;i++)
			arr[i-1] = arr[i];
		arr[n-1] = temp; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+" number element of the array");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter d");
		int d = sc.nextInt();
		for(int i=0;i<d;i++) {
			leftRotateOne(arr,n);
		}
		System.out.println("Array after "+d+" rotations: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
