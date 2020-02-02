
public class ReturnCodesString {
	
	private static int chartoint(char c) {
		return c - '0';
	}
	
	private static char codes(int n) {
		if (n <= 26) {
			char c = (char)('a' + n - 1);
			return c;
		}
		return ' ';
	}
	
	public static String[] getCode(String input) {
		if (input.length() <= 0) {
			String[] s = new String [1];
			s[0] = "";
			return s;
		}
		int n = chartoint(input.charAt(0));
		String[] smalloutput1 = getCode(input.substring(1));
		if (input.length() >= 2) {
		int m = (n * 10) + chartoint(input.charAt(1));
		if (m >= 10 && m <= 26){
			String[] smalloutput2 = getCode(input.substring(2));
			String[] output = new String[smalloutput1.length + smalloutput2.length];
			int k = 0;
			for (int i = 0; i < smalloutput1.length; i++) {
				output[k] = codes(n) + smalloutput1[i];
				k++;
			}
			for (int i = 0; i < smalloutput2.length; i++) {
				output[k]= codes(m) + smalloutput2[i];
				k++;
			}
			return output;
		}
		}
		String[] output = new String[smalloutput1.length];
		int k = 0;
		for (int i = 0; i < smalloutput1.length; i++) {
			output[k] = codes(n) + smalloutput1[i];
			k++;
		}
		return output;
	}

	public static void main(String[] args) {
		String s = "1127";
		String[] out = getCode(s);
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
		int arr[] = new int[5];

	}

}
