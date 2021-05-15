package matrix;

public class PrintBoundaryElements {
	void bTraversal(int mat[][],int R, int C) {
		if(R==1) {  //Corner Case Only horizontal elements present
			for(int i=0;i<C;i++) {
				System.out.print(mat[0][i] +" ");
			}
		}
		else if(C==1){  //Corner Case Only vertical Elements present 
			for(int i=0;i<R;i++)
				System.out.print(mat[i][0] +" ");
		}
		else {
			for(int i=0;i<C;i++)
				System.out.print(mat[0][i] +" ");
			for(int i=1;i<R;i++)
				System.out.print(mat[i][C-1]+ " ");
			for(int i=C-2;i>=0;i--)
				System.out.print(mat[R-1][i]+" ");
			for(int i=R-2;i>=1;i--)
				System.out.print(mat[i][0]+" ");
		}
		
		
//		for (int i = 0; i < R; i++) { 
//            for (int j = 0; j < C; j++) { 
//                if (i == 0) 
//                    System.out.print(mat[i][j] + " "); 
//                else if (i == R - 1) 
//                    System.out.print(mat[i][j] + " "); 
//                else if (j == 0) 
//                    System.out.print(mat[i][j] + " "); 
//                else if (j == C - 1) 
//                    System.out.print(mat[i][j] + " "); 
//                else
//                    System.out.print("  "); 
//            } 
//            System.out.println(""); 
//        } 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
