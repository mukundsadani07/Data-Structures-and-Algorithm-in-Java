package searching;

public class MedianOf2SortedArrays {
	//O((n1+n2))
	static float median(int[] arr1, int[] arr2) {
		float res = 0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		int l = 0;
		int[] temp = new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]>=arr2[j]) {
				temp[k++] = arr2[j++];
			}
			else {
				temp[k++] = arr1[i++];
			}
		}
		while(i<n1) {
			temp[k++] = arr1[i++];
		}
		while(j<n2) {
			temp[k++] = arr2[j++];
		}
//		for(int x=0;x<temp.length;x++) {
//			System.out.print(temp[x]+" ");
//		}
		int n = temp.length;
		if(n % 2==0) {
			return (temp[(n-1)/2]+temp[n/2])/2;
		}else {
			return temp[(n-1)/2];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30};
		int[] arr2 = {5,15,25};
		System.out.println(median(arr1,arr2));
	}
}
