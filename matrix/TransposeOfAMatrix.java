package matrix;

public class TransposeOfAMatrix {
	void transposeMatrix(int arr[][],int n) {
		int ans[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans[i][j] = arr[j][i]; 
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = ans[i][j]; 
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
