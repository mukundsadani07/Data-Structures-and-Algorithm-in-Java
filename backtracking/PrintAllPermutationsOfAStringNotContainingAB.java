package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAllPermutationsOfAStringNotContainingAB {
//	static void permute(String str,int l,int r) {
//		if(l==r) {
//			
//			System.out.println(str);
//			return;
//		}
//		else {
//			for(int i=l;i<=r;i++) {
//				if(isSafe(str,l,i,r)) {
//				char[] c = str.toCharArray();
//				//swap
//				char temp = c[l];
//				c[l] = c[i];
//				c[i] = temp;
//				
//				permute(str,l+1,r);
//				
//				//swap
//				char x = c[l];
//				c[l] = c[i];
//				c[i] = x;
//				}
//			}
//		}
//	}
//	static boolean isSafe(String str,int l,int i, int r) {
//		if(l!=0 && str.charAt(i-1) == 'A' && str.charAt(i) == 'B')
//			return false;
//		if(r==l+1  &&  str.charAt(i) == 'A' && str.charAt(i) == 'B')
//			return false;
//		return true;
//	}
	static void permute(int[] boxes,int ci,int ti) {
		if(ci>ti) {
			for(int i=0;i<boxes.length;i++) {
				System.out.print(boxes[i]);
			}
			System.out.println();
			return;
		}
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i] == 0) {
				boxes[i] = ci;
				permute(boxes,ci+1,ti);
				boxes[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nboxes = Integer.parseInt(br.readLine());
		int ritems = Integer.parseInt(br.readLine());
		permute(new int[nboxes],1,ritems);
//		permute("ABC",0,2);
		 
	}

}
