package librariesInJava;
import java.util.*;
public class Lambda_MethodReferencesInJava {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al= Arrays.asList(10,20,15,16);
		//al.forEach(x -> System.out.println(x));
		
		//method reference
//		al.forEach(System.out::println);
		
		//Method Reference
		//static reference is passed
		al.forEach(Lambda_MethodReferencesInJava::printSquare);
		
	}
	
	public static void printSquare(Integer x) {
		System.out.println(x*x);
	}
}
