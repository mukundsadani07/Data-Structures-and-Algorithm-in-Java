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
		int size;
		Queue(){
			size = 0;
			front = rear = null;
			}
		void enqueue(int x) {
			Node temp = new Node(x);
			size++;
			if(front == null) {
				front = rear = temp;
				return;
			}rear.next = temp;
			rear = temp;
		}
		void dequeue() {
			//empty linked list
			if(front == null)return;
			size--;
			front = front.next;
			//deleting the last element of the queue
			if(front == null) rear = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
	}
}
