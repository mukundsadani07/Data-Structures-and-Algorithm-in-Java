package matrix;

public class RotateMatrixBy90Efficient {
	static void rotate90(int mat[][],int n) {
		
		//transpose
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		//reverse columns
//		for(int i=0;i<n;i++) {
//				int low = 0,high = n-1;
//				while(high>low) {
//					int temp = mat[low][i];
//					mat[low][i] = mat[high][i];
//					mat[high][i] = temp;
//					low++;
//					high--;
//					}
//			}
        for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 int temp =  mat[i][j];
                 mat[i][j] = mat[n-i-1][j];
                 mat[n-i-1][j] = temp;
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
		
		int N = 3;
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		rotate90(mat,N);
		displayMatrix(N,mat);
	}

}
