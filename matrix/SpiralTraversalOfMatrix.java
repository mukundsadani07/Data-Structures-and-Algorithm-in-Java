package matrix;

public class SpiralTraversalOfMatrix {
	void spiralTraversal(int mat[][],int R,int C) {
		int top=0,left=0,bottom=R-1,right = C-1;
		while(top<=bottom && left<=right) {
			
			//top row
			for(int i=left;i<=right;i++)
				System.out.println(mat[top][i]+" ");
			top++;
			
			//right row
			for(int i=top;i<=bottom;i++)
				System.out.println(mat[i][right]+" ");
			right--;
			
			//bottom row
			if(bottom>=top) {
				for(int i=right;i>=left;i--)
					System.out.println(mat[bottom][i]+" ");
				bottom--;
			}
	
			//left row
			if(left<=right) {
				for(int i=bottom;i>=top;i--)
					System.out.println(mat[i][left]+" ");
			    left++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
