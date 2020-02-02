package lecture10;

public class ReverseEachWord {
	
	public static String reversewords(String input) {
		String reverse = "";
		int last = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				for (int j = i; j > last; j--) {
					reverse = reverse + input.substring(j-1,j);
				}
				last = i + 1;
				reverse = reverse + " ";
			}
		}
		for (int j = input.length(); j > last; j --) {
			reverse = reverse + input.substring(j-1,j);
		}
		return reverse;
	}

	public static void main(String[] args) {
		String s = "Welcome To Coding Ninjas";
		System.out.println(reversewords(s));

	}

}
