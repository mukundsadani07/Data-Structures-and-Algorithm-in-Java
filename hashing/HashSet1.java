package hashing;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		h.add("gfg");
		h.add("courses");
		h.add("ide");
		h.add("hello");
		System.out.println(h);
		System.out.println(h.size());
		h.remove("ide");
		System.out.println(h.size());
		System.out.println(h.contains("ide"));
		
//		for(String s:h) {
//			System.out.print(s+" ");
//		}

		System.out.println(h.isEmpty());
		Iterator<String> i = h.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
	}

}
