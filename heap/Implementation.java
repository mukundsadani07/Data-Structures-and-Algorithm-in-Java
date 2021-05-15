package heap;

 class MinHeap{
	int[] arr;
	int size;
	int capacity;
	MinHeap(int c){
		arr = new int[c];
		size = 0;
		capacity = c;
	} 
}
 

public class Implementation {
	int left(int i) {
		return 2*i+1;
	}
	int right(int i) {
		return  2*i+2;
	}
	int parent(int i) {
		return (i-1)/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
}




