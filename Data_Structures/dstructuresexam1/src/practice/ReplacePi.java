package practice;

public class ReplacePi {
	
	public static String replace(String s, int index) {
		if (index >= s.length()) {
			return "";
		}
		if (s.charAt(index) == 'p') {
		if (index + 1 < s.length() && s.charAt(index + 1) == 'i') {
			String ans = "3.14";
			String smallans = replace(s,index + 2);
			return ans + smallans;
		}
		}
		String smallans = replace(s,index + 1);
		return s.charAt(index)+smallans;
		
	}

	public static void main(String[] args) {
		String s = "pied piper";
		String out = replace(s,0);
		System.out.println(out);

	}

}
