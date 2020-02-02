
public class CountWords {
	
	public static int wordcount(String str) {
		int wordcount = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				wordcount = wordcount + 1;
			}
		}
		return wordcount;
	}

	public static void main(String[] args) {
		String s = "this is a sample string";
		System.out.println(wordcount(s));

	}

}
