
public class RemoveX {
	
	private static String removex(String s,int index) {
		if(index >= s.length()) {
			return "";
		}
		String smallans = removex(s,(index+1));
		if (s.charAt(index) == 'x') {
			smallans = smallans + "";
		} else {
			smallans = smallans + s.charAt(index);
		}
		return smallans;
	}
	
	private static String reverseString(String s) {
		String out = "";
		for (int i = s.length()-1; i >= 0; i--) {
			out = out + s.charAt(i);
		}
		return out;
	}
	
	public static String removeX(String input) {
		String s = removex(input,0);
		return reverseString(s);
	}

	public static void main(String[] args) {
		String s = "xx";
		System.out.println(removeX(s));

	}

}
