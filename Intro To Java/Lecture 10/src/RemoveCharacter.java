
public class RemoveCharacter {
	
	public static String removeAllOccurencesOfChar(String input, char c) {
		int i = 0;
		while (i < input.length()) {
			if (input.charAt(i) != c) {
				break;
			}
			i++;
		}
		String output = input.substring(i,i+1);
		i++;
		while ( i < input.length()) {
			if(input.charAt(i) != c) {
				output = output.concat(input.substring(i, i + 1));
			}
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "welcome to coding ninjas";
		char c = 'o';
		String ans = removeAllOccurencesOfChar(str,c);
		System.out.println(ans);

	}

}
