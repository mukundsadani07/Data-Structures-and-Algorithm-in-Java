package sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {5,7,20,10};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder()); 
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,1,4);
		System.out.println(Arrays.toString(arr));
	}

}
