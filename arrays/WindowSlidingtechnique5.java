package arrays;

//FindSubarrayWithAGivenSum
public class WindowSlidingtechnique5 {
	public static int findSubArray(int S, int[] arr) {
	    int windowSum = 0; 
	    int length = 0;
	    int windowStart = 0;
	    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
		      if(windowSum == S) {
		    	  for(int i=windowStart;i<windowEnd;i++) {
		    		  System.out.print(arr[i]+" ");
		    	  }
		    	  System.out.println();
		    	  length = windowEnd-windowStart;
//		    	  System.out.println(length);
		    	  break;
		      }
	      windowSum += arr[windowEnd]; // add the next element
	      // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
	      while (windowSum > S) {
	        windowSum -= arr[windowStart]; // subtract the element going out
	        windowStart++; // slide the window ahead
	      }
	    }

	    return length;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =WindowSlidingtechnique5.findSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
	    System.out.println("subarray length: " + result);
	    result = WindowSlidingtechnique5.findSubArray(7, new int[] { 2, 1, 5, 2, 8 });
	    System.out.println("subarray length: " + result);
	    result = WindowSlidingtechnique5.findSubArray(8, new int[] { 3, 4, 1, 1, 6 });
	    System.out.println("subarray length: " + result);
	}
}


