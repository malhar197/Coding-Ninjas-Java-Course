
public class Subsequences {
	
	public static String[] findSubsequences(String str) {
		
		if (str.length() == 0) {
			String ans[] = {""};
			return ans;
		}
		
		String smallans[] = findSubsequences(str.substring(1));
		String ans[] = new String[2 * smallans.length];
		
		for (int i = 0; i < smallans.length; i++) {
			ans[i] = smallans[i];
		}
		
		for (int i = 0; i < smallans.length; i++) {
			ans[smallans.length + i] = str.charAt(0) + smallans[i]; 
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "wxyz";
		String[] out = findSubsequences(s);
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i] + " ");
		}

	}

}
