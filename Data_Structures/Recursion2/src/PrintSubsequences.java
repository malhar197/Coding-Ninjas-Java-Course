
public class PrintSubsequences {
	
	private static void printSubsequences(String input, String outputsofar) {
		if(input.length() == 0) {
			System.out.println(outputsofar);
			return;
		}
		//we choose not to include the first character
		printSubsequences(input.substring(1), outputsofar);
		// we choose to include the first character
		printSubsequences(input.substring(1), outputsofar + input.charAt(0));
		
	}
	
	public static void printSubsequences(String input) {
		printSubsequences(input, "");
	}

	public static void main(String[] args) {
		printSubsequences("abc");

	}

}
