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
	
	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            } 
            if (matrix[mid / cols][mid % cols] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
