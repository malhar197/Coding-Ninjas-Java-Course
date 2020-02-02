package lecture10;

public class RemoveConsecDups {
	
	public static String remdups(String input) {
	String ans = input.substring(0,1);
	char last = input.charAt(0);
	for (int i = 1; i < input.length(); i++) {
		if (input.charAt(i) != last) {
			ans = ans + input.substring(i,i+1);
			last = input.charAt(i);
		}
	}
	return ans;
	}
	public static void main(String[] args) {
		String s = "aabccbaa";
		System.out.println(remdups(s));

	}

}
