package arrays;

public class DeleteOperation {
	int deleteEle(int arr[],int n,int x) {
		int i;
		for(i=0;i<n;i++)
			if(arr[i] == x)
				break;
		if(i==n) 
			return n;
		for(int j=i;i<n-1;j++)
			arr[i] = arr[j+1];
		return (n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
