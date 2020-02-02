package dynamic_array;

public class DynamicArray {
	private int data[];
	private int nextIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextIndex = 0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public void add(int element) {

		if(nextIndex == data.length) {
			restructure();
		}
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public void set(int index, int element) {
		if(index > nextIndex) {
			return;
		}
		else {
			add(element);
		}
	}
	

	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int removelast() {
		if (size() == 0) {
			return -1;
		}
		int value = data[nextIndex - 1];
		data[nextIndex - 1] = 0;
		nextIndex--;
		return value;
		
	}
	
	private void restructureto(int n) {
		int temp[] = data;
		if (n > data.length) {
		data = new int[n];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
		}
		else {
			return;
		}
	}
	
	private void restructure() {
		int temp[] = data;
		data = new int[data.length * 2];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

}
