package practice;

public class DoesScontainT {
	
	public static boolean checkSequence(String s, String t) {
		if(s.length() == 0 && t.length() != 0) {
			return false;
		}
		if (t.length() == 0) {
			return true;
		}
		if (s.charAt(0) == t.charAt(0)) {
			boolean smallans = checkSequence(s.substring(1),t.substring(1));
			if (smallans == false) {
				return smallans;
			}
		}
		if (s.charAt(0) != t.charAt(0)) {
			boolean smallans = checkSequence(s.substring(1), t);
			if (smallans == false) {
				return smallans;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkSequence("abchjsgsuohhdhyrikkknddg", "coding"));

	}

}
