package binarySearchTree;

import java.util.*;	

public class TreeSetInJava {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Treeset returns the items in increasing order
		TreeSet<String> s = new TreeSet<>();
		s.add("gfg");
		s.add("courses");
		s.add("ide");
		System.out.println(s);
		System.out.println(s.contains("ide"));
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
	}

}
