
public class RemoveDuplicatesRecursively {
	
	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() == 1) {
			return s;
		}
		String ans = "";
		if (s.charAt(0) != s.charAt(1)) {
			ans = ans + s.charAt(0);
		}
		String smallans = removeConsecutiveDuplicates(s.substring(1));
		return ans + smallans;
 	}

	public static void main(String[] args) {
		String s = "aabccbaabbb";
		System.out.println(removeConsecutiveDuplicates(s));

	}

}
