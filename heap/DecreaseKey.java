package heap;

public class DecreaseKey {
	
	int arr[];
	int size,capacity;
	void decreaseKey(int i, int x){
		arr[i] = x;
		while(i!=0 && arr[parent(i)]>arr[i]) {
			//swap
			int temp = arr[i];
			arr[i] = arr[parent(i)];
			arr[parent(i)] = temp;
			
			i=parent(i);
		}
	}
	int parent(int i) {
		return (i-1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {10,20,40,80,100,70};
//		DecreaseKey d = new DecreaseKey();
		
	}
}
