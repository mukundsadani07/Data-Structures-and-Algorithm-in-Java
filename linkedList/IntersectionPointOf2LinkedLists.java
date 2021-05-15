package linkedList;

public class IntersectionPointOf2LinkedLists {
	static int intersection(Node head1,Node head2) {
		Node curr1 = head1,curr2 = head2;
		int c1=0,c2=0;
		while(curr1!=null) {
			curr1 = curr1.next;
			c1++;
		}
		while(curr2 !=null) {
			curr2 = curr2.next;
			c2++;
		}
		int x = Math.abs(c1-c2);
		if(c1>c2) {
			for(int i=0;i<x;i++) {
				curr1 = curr1.next;
			}
		}
		if(c2>c1){
			for(int i=0;i<x;i++) {
				curr2 = curr2.next;
			}
		}
		while(curr1!=null && curr2!=null) {
			if(curr1 == curr2) {
				return curr1.data;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
