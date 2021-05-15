package matrix;

public class SnakePattern {
	 void printSnake(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			if(i%2==0) {
				for(int j=0;j<mat[i].length;j++) {
					System.out.print(mat[i][j]+ " ");
				}
			}
			else{
				for(int j=mat[i].length-1;j>=0;j--) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
