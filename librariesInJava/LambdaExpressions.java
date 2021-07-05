package librariesInJava;

import java.util.*;
import java.util.function.Predicate; 

public class LambdaExpressions {
	static void printCond(Collection<Integer> c,Predicate<Integer> p) {
		for(Integer x: c) {
			if(p.test(x))
				System.out.println(x+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 class MyPredicateEven implements Predicate<Integer>{
//				public boolean test(Integer x) {
//					return (x%2 == 0);
//				}
//			}
//		List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
//		printCond(al,new MyPredicateEven());
		//Lambda Expression code
		List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
		//Functional Interface: An interface with only 1/exactly 1 abstract method
		printCond(al, x-> x%2 == 0);
	}
}
