package practice;

public class StringToInteger {
	
	public static int stringtoint(String s) {
		if (s.length() <= 0) {
			return 0;
		}
		int n = s.charAt(0) - '0';
		for (int i = 1; i < s.length(); i++) {
			n = n * 10;
		}
		int smallans = stringtoint(s.substring(1));
		return n + smallans;
	}

	public static void main(String[] args) {
		System.out.println(stringtoint("123145"));

	}

}
