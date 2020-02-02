
public class PrintKeypad {
	
	private static char[] codes(int n) {
		if (n == 0 || n == 1) {
			char[] ans = new char[0];
			return ans;
		}
		else if (n == 2) {
			char [] ans = {'a','b','c'};
			return ans;
		}
		
		else if (n == 3) {
			char[] ans = {'d','e','f'};
			return ans;
		}
		else if (n == 4) {
			char[] ans = {'g','h','i'};
			return ans;
		}
		else if (n == 5) {
			char[] ans = {'j','k','l'};
			return ans;
		}
		else if (n == 6) {
			char[] ans = {'m','n','o'};
			return ans;
		}
		else if (n == 7) {
			char[] ans = {'p','q','r','s'};
			return ans;
		}
		else if (n == 8) {
			char[] ans = {'t','u','v'};
			return ans;
		}
		else if (n == 9) {
		char[] ans = {'w','x','y','z'};
		return ans;
		}
		char[] ans = new char[0];
		return ans;
	}
	
	private static void printKeypad(int n,String outputsofar) {
		if ( n == 0) {
			System.out.println(outputsofar);
			return;
		}
		
		int k = n % 10;
		char[] c = codes(k);
			printKeypad(n/10, c[0] + outputsofar);
			printKeypad(n/10, c[1] + outputsofar);
			printKeypad(n/10, c[2] + outputsofar);
		if (c.length == 4) {
			printKeypad(n/10, c[3] + outputsofar);
		}
	}
	
	public static void printKeypad(int input) {
		printKeypad(input, "");
	}

	public static void main(String[] args) {
		printKeypad(237);

	}

}
