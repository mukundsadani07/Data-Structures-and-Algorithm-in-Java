package queue;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
public class LinkedListImplementation {
	class Queue{
		Node front,rear;
		Queue(){
			front = rear = null;
			}
		void enqueue(int x) {
			Node temp = new Node(x);
			if(front == null) {
				front = rear = temp;
				return;
			}rear.next = temp;
			rear = temp;
		}
		void dequeue() {
			if(front == null)return;
			front = front.next;
			if(front == null) rear = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
	}
}
