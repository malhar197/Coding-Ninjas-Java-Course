package practice;

public class CheckPalindrome {
	
	private static boolean checkpally(String s,int index) {
		if(index >= s.length()) {
			return true;
		}
		boolean smallans = checkpally(s, index + 1);
		if(s.charAt(index) == s.charAt(s.length()-1-index)) {
			if (smallans == true) {
				return true;	
			}	
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "racecars";
		System.out.println(checkpally(s,0));

	}

}
