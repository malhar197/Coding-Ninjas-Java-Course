package practice;

public class ReplaceCharacter {
	
	public static String replaceChar (String s, char c1, char c2) {
		if(s.length() == 0) {
			return "";
		}
		String smallans = replaceChar(s.substring(1),c1,c2);
		if (s.charAt(0) == c1) {
			return c2 + smallans;
		}
		return s.charAt(0) + smallans;
	}

	public static void main(String[] args) {
		String s = "gpstgcn dcdnt kcll hcmsglf";
		s = replaceChar(s, 'g', 'e');
		s = replaceChar(s,'c','i');
		System.out.println(s);

	}

}
