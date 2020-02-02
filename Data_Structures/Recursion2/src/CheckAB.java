
public class CheckAB {
//	public static boolean checkAB(String input) {
//		if (input.charAt(0) != 'a') {
//			return false;
//		}
//		if (input.substring(input.length()-2) != "bb") {
//			return false;
//		}
//		for (int i = 1; i < input.length(); i++) {
//			if (input.charAt(i) == 'a') {
//				if (input.charAt(i+1) != 'a' && input.substring(i+1,i+3) != "bb" && input.charAt(i+1) != ' ') {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
	
	private static boolean checkAB(String input) {
		  // Handle empty and null cases first.
		  if (input == null || input.isEmpty()) return false;

		  // So long as the string continues to match the pattern, keep stripping
		  // characters from it until it is empty. If you reach empty, it matches the pattern.
		  while (! input.isEmpty()) {
		    // If the first character isn't 'a', we don't match; return false.
		    if (input.charAt(0) != 'a') {
		      return false;
		    }

		    // Check for abb, if so strip all of that, otherwise strip just the a
		    if (input.length() >= 3 && "abb".equals(input.substring(0,3))){
		      input = input.substring(3);
		    } else {
		      input = input.substring(1);
		    }
		  }
		  // Reached empty string, return true.
		  return true;
		}
	public static void main(String[] args) {
		String s = "abbabbb";
		System.out.println(checkAB(s));

	}

}
