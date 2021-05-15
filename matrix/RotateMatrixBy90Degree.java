package matrix;

public class RotateMatrixBy90Degree {
	void RotateMatrix(int mat[][],int n) {
		int temp[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp[n-j-1][i] = mat[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = temp[i][j];
			}
		} 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
