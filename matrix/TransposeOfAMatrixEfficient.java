package matrix;

public class TransposeOfAMatrixEfficient {
	static void transposeMatrix(int arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
//				swap(arr[i][j] = arr[j][i]);
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	static void displayMatrix(int N, int mat[][]){ 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print( 
                    " " + mat[i][j]); 
  
            System.out.print("\n"); 
        } 
        System.out.print("\n"); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		transposeMatrix(arr,3);
		displayMatrix(3,arr);
	}

}
