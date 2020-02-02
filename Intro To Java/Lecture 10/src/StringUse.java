
public class StringUse {
	
	public static void print(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		char c = 'c';
		String str = "abcdefgh"; 
		System.out.println(str.charAt(1));
//		System.out.println(str[1]); incorrect
		System.out.println(str.length());
		System.out.println(str.substring(1,7)); // does not include end index
		System.out.println(str.substring(8)); // from start index till end
		System.out.println(str.contains("cde"));
		System.out.println(str.contains("cdf"));
		print(str);
		}

}
