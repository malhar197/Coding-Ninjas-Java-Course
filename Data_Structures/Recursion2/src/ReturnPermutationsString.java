
public class ReturnPermutationsString {
	
	public static String[] permutationOfString(String input,int index) {
		if (index >= input.length()) {
			String[] s = new String[1];
			s[0] = "";
			return s;
		}
		int length = 1;
		for(int l = input.length(); l > 0 ;l--) {
			length = length * l;
		}
		String[] output = new String[length];
		String[] smalloutput = permutationOfString(input.substring(0, index) + input.substring(index+1, input.length()), index + 1);
		for (int i = 0; i < smalloutput.length; i++) {
			output[i] = input.charAt(index) + smalloutput[i];
		}
		return output;
	}

	public static void main(String[] args) {
		String s = "abc";
		String[] str = permutationOfString(s,0);
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
