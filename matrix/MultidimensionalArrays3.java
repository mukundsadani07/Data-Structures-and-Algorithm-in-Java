package matrix;

public class MultidimensionalArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Jagged Array of user specified sizes
		int m = 3;
		int arr[][] = new int[m][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j]+" ");
			} 
			System.out.println();
		} 
	}

}
