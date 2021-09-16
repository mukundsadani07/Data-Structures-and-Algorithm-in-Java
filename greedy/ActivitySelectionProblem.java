package greedy;

import java.util.*;
class Activity{
	int start;
	int finish;
	Activity(int s,int f){
		start = s;
		finish = f;
	}
}

class MyCmp implements Comparator<Activity>{
	public int compare(Activity a1,Activity a2) {
		return a1.finish - a2.finish;
	}
}
public class ActivitySelectionProblem {
	static int MaxActivity(Activity[] arr) {
		MyCmp m = new MyCmp();
		Arrays.sort(arr, m);
		int res = 1;
		int prev = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i].start >=arr[prev].finish) {
				res++;
				prev = i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {12,10,20};
		int[] f = {25,20,30};
//		int[] s = {5,1,3,0,5,8};
//		int[] f = {9,2,4,6,7,9};
		int n = s.length;
		Activity[] arr = new Activity[n];
		for(int i=0;i<n;i++) {
			arr[i] = new Activity(s[i],f[i]);
		}
		System.out.print(MaxActivity(arr));
 	}
}
