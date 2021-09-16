package librariesInJava;

import java.util.Arrays; 
import java.util.Comparator; 


public class ComparatorReverseOrder {
    public static void main (String[] args) {

        String[] arr = {"gfg", "courses", "ide"};


        Arrays.sort(arr, Comparator.reverseOrder());


        System.out.println(Arrays.toString(arr));
    }

}