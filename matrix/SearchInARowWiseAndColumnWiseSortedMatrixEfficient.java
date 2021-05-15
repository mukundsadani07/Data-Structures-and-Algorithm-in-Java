package matrix;

public class SearchInARowWiseAndColumnWiseSortedMatrixEfficient {
	void searchMatrix(int mat[][],int R, int C, int X) {
		int i=0,j=C-1;
		while(i<R && j>=0) {
			if(mat[i][j] == X) {
				System.out.println("Found at ("+i+","+j+")");
				return;
			}
			else if(mat[i][j]>X)
				j--;
			else
				i++;
		}
		System.out.println("Not Found");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
