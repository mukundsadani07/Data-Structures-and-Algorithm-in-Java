package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	void bucketSort(int arr[],int k) {
		
		//find max value
		int n = arr.length;  //k = bucket size
		int max_val = arr[0];
		for(int i=1;i<n;i++)
			max_val = Math.max(max_val,arr[i]);
		
		
		max_val++;
		
		ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<k;i++)
			bkt.add(new ArrayList<Integer>());
	    
		//Fill Buckets
		for(int i=0;i<n;i++) {
			int bi = (k* arr[i])/max_val;
			bkt.get(bi).add(arr[i]);
		}
		//Sort Buckets
		for(int i=0;i<k;i++) {
			Collections.sort(bkt.get(i));
		 }
		
		//Join Buckets
		int index = 0;
		for(int i=0;i<k;i++)
			for(int j=0;j<bkt.get(i).size();j++)
				arr[index++] = bkt.get(i).get(j);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
