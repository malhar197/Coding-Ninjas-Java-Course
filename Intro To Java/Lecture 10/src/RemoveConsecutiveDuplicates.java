
public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String input) {
		String output = input.substring(0,1);
		for (int i =1; i < input.length(); i++) {
		if(input.charAt(i) == output.charAt(output.length() - 1)) {
			continue;
		}
		output = output.concat(input.substring(i,i+1));
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "aaabbccddeee";
		String s = removeConsecutiveDuplicates(str);
		System.out.println(s);

	}

}
