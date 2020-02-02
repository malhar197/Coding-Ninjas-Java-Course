package linkedliststacks;

public class CheckRedundantBrackets {

	public static boolean checkredundantbrackets(String input) {
		for (int i = 0; i < input.length() - 1;i++) {
			if(input.charAt(i) == '(') {
				if(input.charAt(i) == input.charAt(i + 1) || input.charAt(i+1) == ')') {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int countbracketreversals(String input) {
		if(input.length()%2 != 0) {
			return -1;
		}
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '{') {
				c1++;
			} else {
				c2++;
			}
		}
		if(c1 > c2) {
			return (c1 - c2)/2;
		} else {
			return (c2 - c1)/2;
		}
	}
	
	public static void main(String[] args) {
		String s = "(a + b)";
		System.out.println(checkredundantbrackets(s));

	}

}
