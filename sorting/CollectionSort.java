package sorting;
import java.util.*;
public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(5);
		a.add(20);
		a.add(7);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
	}

}
