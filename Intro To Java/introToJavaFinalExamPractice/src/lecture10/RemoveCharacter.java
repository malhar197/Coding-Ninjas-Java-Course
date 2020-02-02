package lecture10;

public class RemoveCharacter {
	
	public static String removechar(String input, char c) {
		String ans = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				continue;
			}
			ans = ans + input.substring(i,i+1);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String s = "Welcome to coding ninjas";
		char x = 'o';
		System.out.println(removechar(s,x));

	}

}
