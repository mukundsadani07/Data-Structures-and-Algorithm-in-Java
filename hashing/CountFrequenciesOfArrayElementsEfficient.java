package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequenciesOfArrayElementsEfficient {
	static void countFreq(int[] arr) {
		int n = arr.length;
		//LinkedHashMap is for printing in insertion order
//		LinkedHashMap<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		//TreeMap is for printing in ascending order
		TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i],m.get(arr[i])+1);
			}else {
				m.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        countFreq(arr);
	}
}
