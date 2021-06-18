package heap;

public class ExtractMin {
	
//	int extractMin() {
//		if(size == 0)
//			return Integer.MAX_VALUE; //(infinite)
//		if(size == 1) {
//			size--;
//			return arr[0];
//		} 
//	    //swap
//	    int temp = arr[0];
//	    arr[0] = arr[size-1];
//	    arr[size-1] = temp;
	
//		size--;
//		minHeapify(0);
//		return arr[size];
//	}
	
	
	// To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
    static void heapify(int arr[], int n, int i)
    {
        int smallest = i; // Initialize smallest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] < arr[smallest])
            smallest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] < arr[smallest])
            smallest = r;

        // If largest is not root
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, smallest);
        }
    }

    // Function to delete the root from Heap
    static int deleteRoot(int arr[], int n)
    {
    	if(n==0) {
    		return Integer.MAX_VALUE;
    	}
    	if(n==1) {
    		n--;
    		return arr[0];
    	}
    	
        // Replace root with first element
        arr[0] = arr[n-1];

        // Decrease size of heap by 1
        n = n - 1;

        // heapify the root node
        heapify(arr, n, 0);

        // return new size of Heap
        return n;
    }

    /* A utility function to print array of size N */
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String args[])
    {
        // Array representation of Max-Heap
        //     10
        //    /  \
        //   5    3
        //  / \
        // 2   4
        int arr[] = { 10, 5, 3, 2, 4 };

        int n = arr.length;

        n = deleteRoot(arr, n);

        printArray(arr, n);
    }
}
