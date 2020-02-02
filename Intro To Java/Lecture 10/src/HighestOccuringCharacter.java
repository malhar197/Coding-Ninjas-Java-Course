
public class HighestOccuringCharacter {
	
	public static char highestOccuringCharacter(String inputString) {
		int[] freq = new int[256];
		for (int i = 0; i < inputString.length();i++) {
			freq[inputString.charAt(i)]++;
		}
		int largest = Integer.MIN_VALUE;
		int largestindex = 0;
		
		for (int i = 0; i < freq.length; i++) {
			if(freq[i] > largest) {
				largest = freq[i];
				largestindex = i;
			}
		}
		char ans = (char)(largestindex);
		return ans;
	}

	public static void main(String[] args) {
		String s = "aaabbbcddeeff";
		char ans = highestOccuringCharacter(s);
		System.out.println(ans);
		String a = "a";
		int count = 5;
		System.out.println(a + count);

	}

}
