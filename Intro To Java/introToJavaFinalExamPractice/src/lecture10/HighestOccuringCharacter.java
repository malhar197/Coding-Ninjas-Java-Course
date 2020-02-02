package lecture10;

public class HighestOccuringCharacter {
	
	public static char highestoccuring (String inputString) {
		char ans = 'a';
		int[] grid = new int[256];
		
		for (int i = 0; i < inputString.length();i++) {
			grid[inputString.charAt(i)]++;
		}
		int highest = Integer.MIN_VALUE;
		int highestIndex = Integer.MIN_VALUE;
		
		for (int i = 0; i < grid.length; i++) {
			if (grid[i] > highest) {
				highest = grid[i];
				highestIndex = i;
			}
		}
		ans = (char)(highestIndex);
		return ans;
	}

	public static void main(String[] args) {
		String s = "aaabbccdddd";
		System.out.println(highestoccuring(s));

	}

}
