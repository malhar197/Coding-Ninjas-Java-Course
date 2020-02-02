

public class QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}

	int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	T front() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	T rear() {
		return rear.data;
	}
	
	public void enqueue(T n) {
		Node<T> newnode = new Node<T>(n);
		if(size == 0) {
			front = newnode;
			rear = newnode;
		} else {
			rear.next = newnode;
			rear = newnode;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		T n = front.data;
		front = front.next;
		size--;
		return n;
	}
	
	
}
