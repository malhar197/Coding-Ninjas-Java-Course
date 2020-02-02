package lecture10;

public class PrintSubStrings {
	
	public static void printsubs (String s) {
		for (int i = 1; i <= s.length(); i++) {
			System.out.println(s.substring(0, i));
		}
	}

	public static void main(String[] args) {
		String s = "xyz";
		printsubs(s);

	}

}
