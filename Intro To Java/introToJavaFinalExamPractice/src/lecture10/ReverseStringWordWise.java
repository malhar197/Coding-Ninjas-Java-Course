package lecture10;

public class ReverseStringWordWise {
	
	public static String reversewordwise(String s) {
		String reverse = "";
		int end = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				reverse = reverse + s.substring(i+1,end) + " ";
				end = i;
			}
			if (i == 0) {
				reverse = reverse + s.substring(i, end);
			}
		}
		return reverse;
	}

	public static void main(String[] args) {
		String s = "Are You Not Ready Anakin";
		System.out.println(reversewordwise(s));

	}

}
