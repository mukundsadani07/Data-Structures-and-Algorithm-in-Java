package hashing;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("gfg", 10);
		m.put("ide", 15);
		m.put("courses", 20);
		
		System.out.println(m);
		System.out.println(m.size());
		for(Map.Entry<String,Integer>e: m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
//		if(m.containsKey("ide"))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//		m.remove("ide");
//		System.out.println(m.size());
		
		if(m.containsValue(15))
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(m.get("ide"));
		System.out.println(m.get("practise"));
	}

}
