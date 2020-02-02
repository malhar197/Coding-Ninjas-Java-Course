
public class CheckPermutation {
	
	public static boolean isPermutation(String input1, String input2) {
		if (input1.length() != input2.length()) {
			return false;
		}
		else {
		int[] freq = new int[256];
		for(int i = 0; i <input1.length();i++) {
			freq[input1.charAt(i)]++;
		}
		
		for (int i = 0; i < input2.length(); i++) {
			freq[input2.charAt(i)]--;
		}
		
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				return false;
			}
		}
		
		return true;
			
		}
	}
		

	public static void main(String[] args) {
		String s1 = "ramhal";
		String s2 = "malhar";
		System.out.println(isPermutation(s1,s2));

	}

}
