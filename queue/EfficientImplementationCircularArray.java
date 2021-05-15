package queue;

class CircularQueue{
	int[] arr;
	int front,cap,size;
	CircularQueue(int c){
		arr = new int [c];
		cap = c;
		front = 0;
		size = 0;
	}
	boolean isFull() {return(size == cap);}
	boolean isEmpty() {return(size == 0);}
	int getFront() {
		if(isEmpty())
			return -1;
		else
			return front;
	}
	int getRear() {
		if(isEmpty())
			return -1;
		else 
			return (front+size-1)%cap;
	}
	void enqueue(int x) {
		if(isFull())return;
		int rear = getRear();
		rear = (rear+1) %cap;
		size++;
	}
	void dequeue() {
		if(isEmpty()) return;
		front = (front+1) % cap;
		size--;
	}
}
public class EfficientImplementationCircularArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
