package arraystacks;

public class StacksUsingArrays {
	
	private int data[];
	private int top; // index of topmost element of stack
	
	public StacksUsingArrays(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public StacksUsingArrays() {
		data = new int[10];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top + 1;
	}
	
	public int top() throws StackEmptyException {
		if (size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for (int i = 0; i <= top; i++) {
			data[i] = temp[i];
		}
	}
	
	public void push(int elem) throws StackFullException {
		if(size() == data.length) {
//			// Stack Full
//			StackFullException e = new StackFullException();
//			throw e;
			doubleCapacity();
		}
		top++;
		data[top] = elem;
	}

	public int pop() throws StackEmptyException {
		if (size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	
	}
