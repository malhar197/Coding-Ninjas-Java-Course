
public class ReverseEachWord {
	
	public static String reverseEachWord(String input) {
		String output = "";
		int g = 0;
		while (g < input.length()) {
			if (input.charAt(g) == ' ') {
				break;
			}
			g++;
		}
	   for (int f = g; f >= 1; f--) {
		   output = output.concat(input.substring(f - 1,f));
	   }
		
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				for (int j = i; j >= g + 1; j--) {
					output = output.concat(input.substring(j, j + 1));
					}
				g = i;
			}
			if (i == input.length() - 1) {
				output = output + " ";
				for (int j = i; j >= g + 1; j --) {
					output = output.concat(input.substring(j,j+1));
				}
			}
			
		}
		return output;
	}

	public static void main(String[] args) {
		String name = "Welcome to Coding Ninjas";
		String reverse = reverseEachWord(name);
		System.out.println(reverse);

	}

}
