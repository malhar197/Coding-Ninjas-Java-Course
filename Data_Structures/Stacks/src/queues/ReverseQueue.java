package queues;

public class ReverseQueue {
	
	public static void reverseQueue(QueueUsingArray queue) throws QueueFullException {
		if(queue.size() == 0) {
			return;
		}
		int temp = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(temp);
	}
	public static void main(String[] args) throws QueueFullException {
		QueueUsingArray queue = new QueueUsingArray();
		for(int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
	
		reverseQueue(queue);
		queue.print();
	
	}
}
