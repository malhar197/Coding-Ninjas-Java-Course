package test2;

public class MinimumLengthWord {
	
	public static String minlengthword(String input) {
		String min = "";
		int min_count = Integer.MAX_VALUE;
		int count = 0;
		int last = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				count++;
				if (i == input.length() - 1 && count < min_count) {
					min = input.substring(last,i + 1);
				}
			}
			
			else {
				if (count < min_count) {
					min = input.substring(last,i);
					min_count = count;
					
				}
				count = 0;
				last = i + 1;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		String s = "This test string is a";
		System.out.println(minlengthword(s));

	}

}
