package librariesInJava;

import java.util.*;

public class Lambda_MethodReferencesInJav2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"GFG","IDE","Courses"};
		String b[] = {"gfg","ide","courses"};
		if(Arrays.equals(a,b,String::compareToIgnoreCase))
			System.out.println("yes");
		else
			System.out.println("No");
	}
}
