package matrix;

public class SearchInARowWiseAndColumnWiseSortedMatrix {
	void searchRowAndColumn(int mat[][],int R,int C,int X) {
//		boolean flag = false;
//		for(int i=0;i<R;i++) {
//			for(int j=0;j<C;j++) {
//				if(X == mat[i][j]) {
//					System.out.println("Found At ("+i+","+j+")");
//					flag = true;
//					return;
//				}
//			}
//		}
//		if(flag == false) {
//			System.out.println("Not Found");
//		}

		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(X == mat[i][j]) {
					System.out.println("Found At ("+i+","+j+")");
					return;
				}
			}
		}
		System.out.println("Not Found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
