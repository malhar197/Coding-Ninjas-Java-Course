package linkedliststacks;

public class BalancedParenthesis {
	
	public static boolean checkBalanced(String exp) throws StackEmptyException {
		int i = 0;
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		while (i < exp.length()) {
			if(exp.charAt(i) == '{') {
				stack.push(1);
			}
			
			if (exp.charAt(i) == '(') {
				stack.push(2);
			}
			
			if (exp.charAt(i) == '[') {
				stack.push(3);
			}
			
			if (exp.charAt(i) == '}') {
				if(stack.top() == 1) {
					stack.pop();
				} else {
					return false;
				}
			}
			
			if (exp.charAt(i) == ']') {
				if(stack.top() == 3) {
					stack.pop();
				} else {
					return false;
				}
			}
					
			if(exp.charAt(i) == ')') {
				if(stack.top() == 2) {
					stack.pop();
				} else {
					return false;
				}
			}
			i++;
		}
			if(!stack.isEmpty()) {
				return false;
			}
		return true;
	}

	public static void main(String[] args) throws StackEmptyException {
		String s = "{[([({{}})])]}";
		System.out.println(checkBalanced(s));

	}

}
