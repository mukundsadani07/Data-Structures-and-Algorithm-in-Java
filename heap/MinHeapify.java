package heap;

public class MinHeapify {
	int arr[];
	int size,capacity;
	void  minheapify(int i) {
		int lt = left(i), rt = right(i);
		int smallest = i;
		
		if(lt<size && arr[lt]<arr[i])
			smallest = lt;
		
		if(rt<size && arr[rt]<arr[smallest])
			smallest = rt;
		
		if(smallest != i) {
			//swap
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minheapify(smallest);
		}
	}
	
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
