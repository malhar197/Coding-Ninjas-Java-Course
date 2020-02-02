package arraystacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException,StackEmptyException {
		StacksUsingArrays stack = new StacksUsingArrays(3);
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		System.out.println(stack.size());
		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				
			}
			
			
		}
		
	}

}
