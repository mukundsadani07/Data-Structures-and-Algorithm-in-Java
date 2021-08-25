package backtracking;

public class RatInAMaze_CN {
	
	static boolean ratInAMaze(int[][] maze) {
		int n = maze.length;
		int[][] path = new int[n][n];
		return solveMaze(maze,0,0,path);
		
	}
	public static boolean solveMaze(int[][] maze,int i,int j,int[][] path) {
		
		int n = maze.length;
		//Check if i,j cell is valid or not
		if(i < 0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		//Include the cell in the current path
		path[i][j] = 1;
		
		//Destination cell
		if(i == n-1 && j == n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		//Explore further in all directions
		//top
		if(solveMaze(maze,i-1,j,path)) {
			return true;
		}
		//right
		if(solveMaze(maze,i,j+1,path)) {
			return true;
		}
		//down
		if(solveMaze(maze,i+1,j,path)) {
			return true;
		}
		//left
		if(solveMaze(maze,i,j-1,path)) {
			return true;
		}
		path[i][j] = 0;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathPossible = ratInAMaze(maze);
		System.out.println();
		System.out.println(pathPossible);
	}
}
