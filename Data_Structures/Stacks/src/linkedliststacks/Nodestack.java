package linkedliststacks;

public class Nodestack<T> {
	
	T data;
	Nodestack<T> next;
	
	
	public Nodestack(T n) {
		data = n;
		next = null;
	}

}
