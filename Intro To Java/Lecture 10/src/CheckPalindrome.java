
public class CheckPalindrome {
	
	public static boolean checkpalindrome(String str) {
		char[] c = new char[str.length()];
		str.getChars(0,c.length, c, 0);
		char[] reverse = new char[c.length];
		for (int i = 0; i < c.length; i++) {
			reverse[reverse.length - i - 1] = c[i];
		}
		for(int i = 0; i < reverse.length;i++) {
			if (reverse[i] != c[i]) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		String str = "lohthol";
		System.out.println(checkpalindrome(str));

	}

}
