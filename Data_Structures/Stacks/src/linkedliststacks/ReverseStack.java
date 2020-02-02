package linkedliststacks;

import java.util.Stack;

public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.isEmpty()){
            return;
        }
        int elem = s1.pop();
        reverseStack(s1,s2);
        while(!s1.isEmpty()) {
			int temp = s1.pop();
			s2.push(temp);
		}
        s1.push(elem);
        while(!s2.empty()) {
        	s1.push(s2.pop());
        }
	}
	
	public static Stack<Integer> reverseStack(Stack<Integer> stack){
		Stack<Integer> reverse = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			reverse.push(temp);
		}
		return reverse;
	}
	
	public static void printStack(Stack<Integer> stack){
		int i = 0;
		while(i < stack.size()) {
		System.out.println(stack.get(i));
		i++;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i <= 4 ; i++) {
			stack.push(i);
		}
		printStack(stack);
		
		Stack<Integer> reverse = new Stack<Integer>();
		reverseStack(stack,reverse);
		printStack(stack);
	}

}
