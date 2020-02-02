
public class CheckPalindromeRecursive {
	
	private static boolean isStringPalindrome(String s,int start, int end) {
		if(start == end -1 || start > end - 1) {
			return true;
		}
		if (s.charAt(start) != s.charAt(end - 1) ) {
			return false;
		}
		boolean smallans = isStringPalindrome(s,start + 1, end - 1);
		if (!smallans) {
			return false;
		}
		return true;
	}
	
	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, 0, input.length());
	}
			
	public static void main(String[] args) {
		String s = "otoato";
		System.out.println(isStringPalindrome(s));

	}

}
