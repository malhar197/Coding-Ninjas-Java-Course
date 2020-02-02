
public class PrintAllSubstrings {
	
	public static void printsubstrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i);
			for (int j = 1; j <= s.length(); j++) {
				System.out.println(s.substring(0,j));
			}
		}
	}

	public static void main(String[] args) {
		String s = "xyz";
		printsubstrings(s);

	}

}
