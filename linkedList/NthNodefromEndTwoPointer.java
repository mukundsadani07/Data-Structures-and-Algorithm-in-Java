package linkedList;

public class NthNodefromEndTwoPointer {
	Node printingNthNode(Node head,int n) {
//		if(head == null) return;
//		Node first = head;
//		for(int i=0;i<n;i++) {
//			if(first == null) return;
//			first = first.next;
//		}
//		Node second = head;
//		while(first!=null) {
//			second = second.next;
//			first = first.next;
//		}
//		System.out.println(second.data);
//	}
	
		
		if(head == null){
            return null;
        }
        
        Node c = head;
        int count = 0;
        while(c!=null){
            count++;
            c = c.next;
        }
        if(count==n){
            return head.next;
        }else{
            Node prev = null,curr = head;
            while(curr!=null){
                if(count == n){
                    prev.next = curr.next;
                    break;
                }else{
                    prev = curr;
                    curr = curr.next;
                    count--;
                }
            }
        }
        return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
