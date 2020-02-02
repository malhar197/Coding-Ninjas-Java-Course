package linkedliststacks;

public class StackCollections {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		stack.size();
		int arr[] = {5,2,8,1};
		for (int i = 0; i < arr.length;i++){
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
