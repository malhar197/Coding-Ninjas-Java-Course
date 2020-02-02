
public class Dequeue<T> {

	private Node<T> rear;
	private Node<T> front;
	int size;
	
	public Dequeue() {
		rear = null;
		front = null;
		size = 10;
	}
	
	public T getFront() {
		if(front == null) {
			System.out.println(-1);
			return null;
		}
		return front.data;
	}
	
	public T getRear() {
		if (rear == null) {
			System.out.println(-1);
			return null;
		}
		return rear.data;
	}
	
	public void insertFront(T element) {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		Node<T> newNode = new Node<T>(element);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
		front.prev = newNode;
		newNode.next = front;
		front = newNode;
		}
		size--;
	}
	
	public void insertRear(T element) {
		if(size == 0) {
			System.out.println(-1);
			return;
		}
		Node<T> newNode = new Node<T>(element);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			newNode.prev = rear;
			rear.next = newNode;
			rear = newNode;
		}
		size--;
	}
	
	public void deleteFront() {
		if(size == 10) {
			System.out.println(-1);
			return;
		}
		front = front.next;
		front.prev = null;
		size++;
	}
	
	public void deleteRear() {
		if(size == 10) {
			System.out.println(-1);
			return;
		}
		rear = rear.prev;
		rear.next = null;
		size++;
	}
	
	
}
