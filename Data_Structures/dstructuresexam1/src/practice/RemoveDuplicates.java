package practice;

public class RemoveDuplicates {
	
	public static String remdups(String s) {
		if(s.length() == 0) {
			return "";
		}
		String smallans = remdups(s.substring(1));
		if(s.length() > 1 && s.charAt(0) == s.charAt(1)) {
			return "" + smallans;
		}
		return s.charAt(0) + smallans;
	}

	public static void main(String[] args) {
		String s = "aabbbbbc";
		System.out.println(remdups(s));

	}

}
