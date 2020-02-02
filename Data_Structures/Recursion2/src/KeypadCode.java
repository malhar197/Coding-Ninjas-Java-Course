
public class KeypadCode {
	
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
	
	public static String[] keypad (int n) {
		if ( n == 0) {
			String[] ans = {""};
			return ans;
		}
		
		int k = n % 10;
		char[] c = codes(k);
		String[] smallans = keypad(n / 10);
		String[] ans = new String[smallans.length * c.length];
		int i = 0;
		for (int j = 0; j < smallans.length; j++) {
			for (int l = 0; l < c.length; l++) {
				ans[i] = smallans[j] + c[l];
				i++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 29;
		String[] s = keypad(n);
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			count++;
		}
		System.out.println(count);
	}

}
