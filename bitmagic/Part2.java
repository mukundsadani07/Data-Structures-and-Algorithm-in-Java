package bitmagic;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=3;
		//Not operator
		System.out.println(~x); 
		//left shift operator   
		System.out.println(x<<1);
		System.out.println(x<<2);
		int y=4;
		int z = (x<<y);
		System.out.println(z); 
		System.out.println(x<<30);
		int a = -1;
		System.out.println(x<<1);
	}
}

