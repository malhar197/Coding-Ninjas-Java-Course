package queues;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingArray queue = new QueueUsingArray(3);
		for(int i = 1; i <= 5; i++) {
			try	{
				queue.enqueue(i);
			} catch (QueueFullException e) {
				
			}
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}

	}

}
