
public class ReverseStringWordWise {
	
	public static String reversestringwordwise(String input) {
		int j = input.length();
		int spaceindex = input.length() - 1;
		while (spaceindex >= 0) {
			if(input.charAt(spaceindex) == ' ') {
				break;
			}
			spaceindex--;
		}
		String reverse = input.substring(spaceindex + 1,j);
		j = spaceindex;
		spaceindex--;
		
		while (spaceindex >= 0) {
			if (input.charAt(spaceindex) == ' ' || spaceindex == 0) {
				reverse = reverse + input.substring(spaceindex, j);
				j = spaceindex + 1;
			}
			spaceindex--;
		}
		
		System.out.println(reverse);
		
		return reverse;
		
	}

	public static void main(String[] args) {
		String s = "Welcome to Coding Ninjas";
		
		reversestringwordwise(s);

	}

}
