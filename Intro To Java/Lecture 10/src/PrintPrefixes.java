
public class PrintPrefixes {
	
	public static void printprefixes(String str) {
		for(int i = 1; i <= str.length(); i++) {
			System.out.println(str.substring(0,i));
		}
	}

	public static void main(String[] args) {
		String s = "malhar";
		printprefixes(s);

	}

}
