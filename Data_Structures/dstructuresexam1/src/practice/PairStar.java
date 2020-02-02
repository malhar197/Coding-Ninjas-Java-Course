package practice;

public class PairStar {
	
	public static String addStars(String s) {
		if (s.length() <= 0) {
			return "";
		}
		
		String smallans = addStars(s.substring(1));
		
		if(s.length() > 1 && s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + smallans;
		}
		return s.charAt(0) + smallans;
	}

	public static void main(String[] args) {
		String s = "aaaaaa";
		System.out.println(addStars(s));

	}

}
