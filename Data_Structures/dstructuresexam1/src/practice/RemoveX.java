package practice;

public class RemoveX {
	
	public static String removeX(String s) {
		if (s.length() <= 0) {
			return "";
		}
		String smallans = removeX(s.substring(1));
		if (s.charAt(0) == 'x') {
			return "" + smallans;
		}
		return s.charAt(0) + smallans;
	}

	public static void main(String[] args) {
		String s = "parthurnax";
		System.out.println(removeX(s));

	}

}
