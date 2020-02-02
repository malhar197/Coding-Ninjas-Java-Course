package linkedliststacks;

public class StackUsingLL<T> {

	private Nodestack<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public T top() throws StackEmptyException {
		if (head == null) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	
	public boolean isEmpty() {
		return(size == 0);
	}
	
	public void push (T elem) {
		Nodestack<T> newhead = new Nodestack<T>(elem);
		if(head != null) {
			newhead.next = head;
		}
		size++;
		head = newhead;
	}
	
	public T pop() throws StackEmptyException {
		if(head == null) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T ans = head.data;
		head = head.next;
		size--;
		return ans;
	}
}
