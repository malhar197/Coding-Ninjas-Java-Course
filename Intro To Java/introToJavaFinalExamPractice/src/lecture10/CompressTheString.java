package lecture10;

public class CompressTheString {
	
	public static String compress (String s) {
		String compressed = s.charAt(0) + "";
		int count = 1;
		for (int i = 1; i < s.length();i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}
			else {
				if  (count > 1){
					compressed = compressed + count + s.charAt(i);
				}
				else {
					compressed = compressed + s.charAt(i);
				}
				count = 1;
			}
		}
		return compressed;
	}
		

	public static void main(String[] args) {
		String s = "aaabbccdsa";
		System.out.println(compress(s));

	}

}
